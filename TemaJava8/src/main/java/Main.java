public class Main {

    public static void main(String[] args) {

        Persons persons = new Persons();
        persons.returnFileWithNamesByMonth("src/main/resources/persons.txt", "2", "februarie");

    }
}
