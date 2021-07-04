import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Results {
    private List results;

    public Results() {
        results = new ArrayList<Result>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/results.csv"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                Result result = new Result();

                Scanner s = new Scanner(line);
                s.useDelimiter(", ");

                if (s.hasNext()) {
                    result.setAthleteNumber(s.next());
                    result.setAthleteName(s.next());
                    result.setCountryCode(s.next());
                    result.setSkyTimeResult(s.next());
                    result.setFirstShootingRange(s.next());
                    result.setSecondShootingRange(s.next());
                    result.setThirdShootingRange(s.next());
                    result.setPenaltyInSeconds();
                    result.setFinalResultInSeconds();
                }
                results.add(result);
            }
        } catch (IOException e) {
            System.out.println(e);

        }
    }

    public List getResults() {
        return results;
    }
}
