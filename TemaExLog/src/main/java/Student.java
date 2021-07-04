public class Student {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;
    private String gender;
    private String cnp;
    private int age;

    public Student(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth, String gender, String cnp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender.toUpperCase();
        this.cnp = cnp;
        dateOfBirth = Integer.toString(dayOfBirth) + "-"
                + Integer.toString(monthOfBirth) + "-"
                + Integer.toString(yearOfBirth);
        age = 2021 - yearOfBirth;
        if (monthOfBirth > 6) {
            age -= 1;
        } else if (monthOfBirth == 6 && dayOfBirth > 24) {
            age -= 1;
        }
    }

    public String getCnp() {
        return cnp;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student: " +
                "prenume = '" + firstName + '\'' +
                ", nume de familie = '" + lastName + '\'' +
                ", data nasterii = '" + dateOfBirth + '\'' +
                ", sex = '" + gender + '\'' +
                ", CNP = " + cnp +
                ", varsta = " + age;
    }
}
