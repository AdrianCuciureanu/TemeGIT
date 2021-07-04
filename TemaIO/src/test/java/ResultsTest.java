import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class ResultsTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Befour test");
        List list = new ArrayList<>();
        list.add(new Result("1", "Martin Ponsiluoma", "SE", "34:46", "oxxox", "xxxoo", "xxxxx,"));
        list.add(new Result("2", "Simon Desthieux", "FR", "32:03", "xxxxo", "xoxxx", "xxoxx,"));
        list.add(new Result("3", "Emilien Jacquelin", "FR", "29:03", "oxoxo", "xxooo", "oooox,"));
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After test");
    }

    @Test
    public void testResultsFromMemory() {
        Result res1 = new Result("1", "Martin Ponsiluoma", "SE", "34:46", "oxxox", "xxxoo", "xxxxx,");
        Result res2 = new Result("2", "Simon Desthieux", "FR", "32:03", "xxxxo", "xoxxx", "xxoxx,");
        Result res3 = new Result("3", "Emilien Jacquelin", "FR", "29:03", "oxoxo", "xxooo", "oooox,");
        Results results = new Results();
        assertEquals(res1, results.getResults().get(0));
        assertEquals(res2, results.getResults().get(1));
        assertEquals(res3, results.getResults().get(2));
    }

    @Test
    public void testResults() {
        Results results = new Results();
        for (int i = 0; i < results.getResults().size(); i++) {
            Result result = (Result) results.getResults().get(i);
            assertSame(result, results.getResults().get(i));
            assertEquals(result.getFinalResultInSeconds(), ((Result) results.getResults().get(i)).getFinalResultInSeconds());
            assertEquals(result.getPenaltyInSeconds(), ((Result) results.getResults().get(i)).getPenaltyInSeconds());
        }
    }

    @Test
    public void testSetFinalResultInSeconds() {
        Result result = new Result("1", "Martin Ponsiluoma", "SE", "34:46", "oxxox", "xxxoo", "xxxxx");
        int rezultat = 2086 + 40;
        assertEquals(rezultat, result.getFinalResultInSeconds());
    }

    @Test
    public void setPenaltyInSeconds() {
        Result result = new Result("1", "Martin Ponsiluoma", "SE", "34:46", "oxxox", "xxxoo", "xxxxx");
        int rezultat = 40;
        assertEquals(rezultat, result.getPenaltyInSeconds());
    }
}