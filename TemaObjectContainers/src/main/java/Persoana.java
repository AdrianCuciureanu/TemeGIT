import java.util.Objects;

public class Persoana {
    private int age;
    private String name;
    private String CNP;

    public Persoana(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getCNP() {
        return CNP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persoana)) return false;
        Persoana persoana = (Persoana) o;
        return getAge() == persoana.getAge() && Objects.equals(getName(), persoana.getName()) && Objects.equals(getCNP(), persoana.getCNP());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName(), getCNP());
    }

}
