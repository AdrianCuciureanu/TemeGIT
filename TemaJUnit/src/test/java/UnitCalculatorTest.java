import junit.framework.TestCase;

public class UnitCalculatorTest extends TestCase {

    private UnitCalculator calculator;

    public void setUp() throws Exception {
        System.out.println("Befour test method!");
        calculator = new UnitCalculator("10 cm + 1 m - 10 mm + 1 km      ");
    }

    public void tearDown() throws Exception {
        System.out.println("After test method!");
    }

    public void testMmCalculator() {
        Double rezultat = calculator.mmCalculator();
        assertEquals(1001090.0, rezultat);

    }

    public void testCmCalculator() {
        Double rezultat = calculator.cmCalculator();
        assertEquals(100109.0, rezultat);
    }

    public void testDmCalculator() {
        Double rezultat = calculator.dmCalculator();
        assertEquals(10010.9, rezultat);
    }

    public void testMCalculator() {
        Double rezultat = calculator.mCalculator();
        assertEquals(1001.09, rezultat);
    }

    public void testKmCalculator() {
        Double rezultat = calculator.kmCalculator();
        assertEquals(1.00109, rezultat);
    }
}