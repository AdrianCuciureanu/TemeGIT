public class MainFaraExceptii {
    public static void main(String[] args) {
        ListaStudenti lista = getListaStudenti();

        lista.printStudentByAge(32);

        lista.print();

        lista.sort();
        lista.print();

        lista.delete("1890116030013");
        lista.print();

    }

    private static ListaStudenti getListaStudenti() {
        ListaStudenti lista = new ListaStudenti();
        lista.add("Adi", "Craciun", 1989, 1, 16, "M", "1890116121203");
        lista.add("Ion", "Vladescu", 1991, 8, 10, "M", "1910810121207");
        lista.add("Maria", "Serban", 1987, 7, 12, "f", "1870712121209");
        lista.add("George", "Berevoianu", 1990, 6, 28, "M", "1900628121202");
        lista.add("Liliana", "Anghelescu", 1989, 3, 25, "f", "1890325121201");
        return lista;
    }
}
