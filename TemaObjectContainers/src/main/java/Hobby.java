import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String name;
    private int numberOfTimesPerWeek;
    private List<Adresa> adressesToPractice;

    public Hobby(String name, int numberOfTimesPerWeek) {
        this.name = name;
        this.numberOfTimesPerWeek = numberOfTimesPerWeek;
        this.adressesToPractice = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfTimesPerWeek() {
        return numberOfTimesPerWeek;
    }

    public List<Adresa> getAdressesToPractice() {
        return adressesToPractice;
    }

    public void setAdressesToPractice(List<Adresa> adressesToPractice) {
        this.adressesToPractice = adressesToPractice;
    }

    public void addAdresa(Adresa adresa) {
        adressesToPractice.add(adresa);
    }
}
