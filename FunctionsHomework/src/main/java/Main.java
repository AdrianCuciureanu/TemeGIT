import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SalesRepresentativeSort sort = new SalesRepresentativeSort();

        List<SalesRepresentative> vanzari = new ArrayList<SalesRepresentative>(initializareLista());
        System.out.println("Befour sort:");
        print(vanzari);

        System.out.println("After sort:");
        sort.sort(vanzari);
        print(vanzari);

    }

    private static List<SalesRepresentative> initializareLista() {
        List<SalesRepresentative> lista = new ArrayList<>();
        lista.add(new SalesRepresentative("Ion", 8, 750));
        lista.add(new SalesRepresentative("Elena", 5, 900));
        lista.add(new SalesRepresentative("Andrei", 9, 500));
        lista.add(new SalesRepresentative("Maria", 7, 800));
        lista.add(new SalesRepresentative("Gheorghe", 4, 2000));
        return lista;
    }

    private static void print(List<SalesRepresentative> vanzari) {
        for (SalesRepresentative item : vanzari) {
            System.out.println(item);
        }
    }
}
