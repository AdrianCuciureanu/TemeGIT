import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Persons {
    private List<Person> personsList;

    public Persons() {
        personsList = new ArrayList<>();
    }

    public void returnFileWithNamesByMonth(String filePath, String month, String newFileName) {
        /**
         * Citire fisier si extragere intr-o lista
         */
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            stream.forEach(str -> {
                Person person = new Person(str);
                personsList.add(person);
            });
        } catch (IOException e) {
            System.out.println("File reader error");
            e.printStackTrace();
        }
        /**
         * Sortare lista
         */

        Comparator<Person> compareByFirstName = (Person p1, Person p2) -> p1.getFirstName().compareTo(p2.getFirstName());
        personsList.sort(compareByFirstName);

        /**
         * Creare fisier si scriere in el lista de persoane nascuta in luna mentionata
         */

        String newFilePath = "src/main/resources/" + newFileName + ".txt";
        try (FileWriter file = new FileWriter(newFilePath)) {
            personsList.forEach(person -> {
                String[] birthDate = person.getDateOfBirth().split("-");
                String birthMonth = birthDate[1];
                if (birthMonth.equals(month)) {
                    try {
                        file.write(person.getFirstName() + ", " + person.getLastName() + "\n");
                        System.out.println(person.getFirstName() + ", " + person.getLastName());
                    } catch (IOException e) {
                        System.out.println("Write file error");
                        e.printStackTrace();
                    }
                }
            });
        } catch (IOException e) {
            System.out.println("File output error");
            e.printStackTrace();
        }
    }

    public List<Person> getPersonsList() {
        return personsList;
    }
}
