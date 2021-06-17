import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Persoana> persoaneDupaNume = new TreeSet<Persoana>(new comparatorName());
        initializareLista(persoaneDupaNume);
        System.out.println("TreeSet sortat dupa nume: ");
        printList(persoaneDupaNume);

        Set<Persoana> persoaneDupaAge = new TreeSet<Persoana>(new comparatorAge());
        initializareLista(persoaneDupaAge);
        System.out.println("TreeSet sortat dupa varsta: ");
        printList(persoaneDupaAge);


        Map<Persoana, List<Hobby>> mapHobbyuriPersoane = new HashMap<Persoana, List<Hobby>>();
        initializareMap(mapHobbyuriPersoane);
        Persoana persoanaCautata = new Persoana("Adrian", 32);
        afisareHobbyuri(persoanaCautata, mapHobbyuriPersoane);


    }

    private static void printList(Set<Persoana> personas) {
        for (Persoana persoana : personas) {
            System.out.println(persoana.getName() + " " + persoana.getAge());
        }
    }

    private static void initializareLista(Set<Persoana> persoanas) {
        persoanas.add(new Angajat("Adrian", 32));
        persoanas.add(new Somer("Ion", 23));
        persoanas.add(new Student("Maria", 40));
        persoanas.add(new Angajat("Gheorghe", 24));
    }

    private static void afisareHobbyuri(Persoana persoana, Map<Persoana, List<Hobby>> mapHobbyuriPersoane) {
        for (Map.Entry<Persoana, List<Hobby>> entry : mapHobbyuriPersoane.entrySet()) {
            if (entry.getKey().equals(persoana)) {
                System.out.println("Hobby list for person: " + entry.getKey().getName());
                printHobbiesForPerson(entry.getValue());
            }
        }
    }

    private static void printHobbiesForPerson(List<Hobby> hobbies) {
        for (Hobby hobby : hobbies) {
            System.out.print(hobby.getName() + " si tarile: ");
            for (Adresa adresa : hobby.getAdressesToPractice()) {
                System.out.print(adresa.getTara() + " ");
            }
            System.out.println();
        }
    }

    private static void initializareMap(Map<Persoana, List<Hobby>> map) {
        map.put(new Angajat("Adrian", 32), initializareHobbyuriPers1());
        map.put(new Somer("Ion", 23), initializareHobbyuriPers2());
    }

    private static List<Hobby> initializareHobbyuriPers1() {
        List<Hobby> hobbyList = new ArrayList<>();
        Hobby hobby1 = new Hobby("Parapanta", 2);
        hobby1.addAdresa(new Adresa("Romania", "acolo"));
        hobby1.addAdresa(new Adresa("Norvegia", "dincolo"));

        Hobby hobby2 = new Hobby("Alpinism", 1);
        hobby2.addAdresa(new Adresa("Romania", "Muntii Bucegi"));
        hobby2.addAdresa(new Adresa("Elvetia", "Muntii Alpi"));

        hobbyList.add(hobby1);
        hobbyList.add(hobby2);
        return hobbyList;
    }

    private static List<Hobby> initializareHobbyuriPers2() {
        List<Hobby> hobbyList = new ArrayList<>();
        Hobby hobby1 = new Hobby("Pescuit", 10);
        hobby1.addAdresa(new Adresa("Romania", "Delta Dunarii"));
        hobby1.addAdresa(new Adresa("Italia", "Raul Po"));
        hobby1.addAdresa(new Adresa("Spania", "Raul Ebro"));

        hobbyList.add(hobby1);
        return hobbyList;
    }
}
