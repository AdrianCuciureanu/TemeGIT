import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PersonsTest extends TestCase {
    @Before
    public void setUp() throws Exception {
        super.setUp();
        System.out.println("Inainte de test!");
    }

    @Test
    public void testPersons() {
        Persons persons = new Persons();
        persons.returnFileWithNamesByMonth("src/main/resources/persons.txt", "2", "februarie");
        Person firstRezult = new Person("Adelina,Popa,1990-6-16");
        Person lastRezult = new Person("Vlad,Nastaciuc,1990-2-16");

        assertEquals(firstRezult.getFirstName(), persons.getPersonsList().get(0).getFirstName());
        assertEquals(firstRezult.getLastName(), persons.getPersonsList().get(0).getLastName());
        assertEquals(firstRezult.getDateOfBirth(), persons.getPersonsList().get(0).getDateOfBirth());
        assertEquals(lastRezult.getFirstName(), persons.getPersonsList().get(persons.getPersonsList().size() - 1).getFirstName());
        assertEquals(lastRezult.getLastName(), persons.getPersonsList().get(persons.getPersonsList().size() - 1).getLastName());
        assertEquals(lastRezult.getDateOfBirth(), persons.getPersonsList().get(persons.getPersonsList().size() - 1).getDateOfBirth());

        assertEquals(firstRezult, persons.getPersonsList().get(0));
        assertEquals(lastRezult, persons.getPersonsList().get(persons.getPersonsList().size() - 1));

        try {
            Files.delete(Path.of("src/main/resources/februarie.txt"));
        } catch (IOException e) {
            System.out.println("Error deleting the file");
            e.printStackTrace();
        }
        persons = null;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Test terminat!");
    }
}