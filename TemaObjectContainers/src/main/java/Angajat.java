public class Angajat extends Persoana {
    private int salar;

    public Angajat(String name, int age) {
        super(name, age);
        salar = 0;
    }

    public int getSalar() {
        return salar;
    }

}
