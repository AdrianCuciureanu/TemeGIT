import java.util.Comparator;

public class comparatorName implements Comparator<Persoana> {
    @Override
    public int compare(Persoana obj1, Persoana obj2) {
        return obj1.getName().compareTo(obj2.getName());
    }
}
