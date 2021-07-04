import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Results results = new Results();
        System.out.println(results.getResults());

        List<Result> list = new ArrayList<>();
        extract(results, list);
        Collections.sort(list);

        System.out.println("Winner - " + list.get(0) + "\nRunner-up - " + list.get(1) + "\nThird Place - " + list.get(2));
    }

    private static void extract(Results results, List<Result> list) {
        for (int i = 0; i < results.getResults().size(); i++) {
            list.add((Result) results.getResults().get(i));
        }
    }
}
