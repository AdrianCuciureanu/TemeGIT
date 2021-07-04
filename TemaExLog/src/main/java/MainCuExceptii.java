public class MainCuExceptii {
    public static void main(String[] args) {
        ListaStudenti lista = getListaStudenti();

        lista.printStudentByAge(32);

        lista.print();

        lista.sort();
        lista.delete("189011612120");
        lista.delete("1890116121204");
        lista.delete("1890116121203");
        lista.print();

    }

    private static ListaStudenti getListaStudenti() {
        ListaStudenti lista = new ListaStudenti();
        lista.add("Adi", "Craciun", 1989, 1, 16, "M", "1890116121203");
        lista.add("", "Vladescu", 1991, 8, 10, "M", "1910810121207");
        lista.add("Maria", "", 1987, 7, 12, "f", "1870712121209");
        lista.add("George", "Berevoianu", 1990, 6, 28, "male", "1900628121202");
        lista.add("Liliana", "Anghelescu", 1899, 3, 25, "f", "1890325121201");
        lista.add("Ion", "Vladescu", 1991, 8, 10, "M", "19108101212071");
        lista.add("Maria", "Serban", 1987, 7, 12, "f", "1870712AA1209");
        lista.add("George", "Berevoianu", 2025, 6, 28, "M", "1900628121202");
        lista.add("Liliana", "Anghelescu", 2010, 3, 25, "f", "1890325121201");
        return lista;
    }
}
