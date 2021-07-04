import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListaStudenti {
    private List<Student> lista;

    public ListaStudenti() {
        lista = new ArrayList<Student>();
    }

    public void add(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth, String gender, String cnp) {
        try {
            if (StringUtils.isWhitespace(firstName)) {
                throw new ValidationException("First name must contain at least 1 char");
            } else if (StringUtils.isWhitespace(lastName)) {
                throw new ValidationException("Last name must contain at least 1 char");
            } else if (!(yearOfBirth >= 1900)) {
                throw new ValidationException("Date of birth can not be befour the year of 1900");
            } else if (!(gender.toUpperCase().equals("M") | gender.toUpperCase().equals("F"))) {
                throw new ValidationException("Gender can be exactly 'm' or 'f', lower or upper case.");
            } else if (cnp.length() != 13) {
                throw new ValidationException("CNP should be exactly 13 digits long");
            } else if (!StringUtils.isNumeric(cnp)) {
                throw new ValidationException("CNP digits must be number format");
            }
            Student student = new Student(firstName, lastName, yearOfBirth, monthOfBirth, dayOfBirth, gender, cnp);
            if (student.getAge() < 0) {
                throw new ValidationException("Wrong birth date. The year of birth can not be from the future.");
            } else if (student.getAge() >= 0 & student.getAge() < 18) {
                throw new ValidationException(firstName + " " + lastName + " este prea tanar/a pentru a fi student");
            }
            lista.add(student);
        } catch (ValidationException e) {
            System.out.println(e.getErorr() + e.getMessage());
        }
    }

    public void delete(String cnp) {
        try {
            if (StringUtils.isWhitespace(cnp) | cnp.length() != 13 | !StringUtils.isNumeric(cnp)) {
                throw new ValidationException("The student does not exist");
            } else {
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getCnp().equals(cnp)) {
                        lista.remove(i);
                    }
                }
            }

        } catch (ValidationException e) {
            System.out.println(e.getErorr() + e.getMessage());
        }
    }


    public void printStudentByAge(int age) {
        System.out.println(" ");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getAge() == age) {
                System.out.println(lista.get(i));
            }
        }
    }

    public void print() {
        System.out.println(" ");
        try {
            if (lista.isEmpty()) {
                throw new ValidationException("The repository is empty.");
            } else {
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(lista.get(i));
                }
            }
        } catch (ValidationException e) {
            System.out.println(e.getErorr() + e.getMessage());
        }
    }

    public void sort() {
        try {
            if (lista.isEmpty()) {
                throw new ValidationException("Lista este goala.");
            } else if (lista.size() < 2) {
                throw new ValidationException("Lista nu se poate sorta pentru ca are un singur element");
            } else {
                Set<Student> set = new TreeSet<Student>(new ComparatorByLastName());
                for (int i = lista.size() - 1; i >= 0; i--) {
                    set.add(lista.get(i));
                    lista.remove(i);
                }
                for (Student student : set) {
                    lista.add(student);
                }
                set = null;
            }
        } catch (ValidationException e) {
            System.out.println(e.getErorr() + e.getMessage());
        }
    }
}
