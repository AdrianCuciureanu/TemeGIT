import java.util.List;

public class SalesRepresentativeSort {

    public void sort(List<SalesRepresentative> array) {
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.size() - i - 1; j++) {
                if (array.get(j).getRevenueGenerated() < array.get(j + 1).getRevenueGenerated()) {
                    SalesRepresentative temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }
    }
}
