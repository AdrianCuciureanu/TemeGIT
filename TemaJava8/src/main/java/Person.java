import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public Person(String line) {
        String[] splitLine = line.split(",");
        firstName = splitLine[0];
        lastName = splitLine[1];
        dateOfBirth = splitLine[2];
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getDateOfBirth(), person.getDateOfBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getDateOfBirth());
    }
}
