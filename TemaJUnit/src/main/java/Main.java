public class Main {
    /*
    Calculatorul functioneaza doar daca expresia introdusa are elementele: numar, unitate masura(m, mm, cm, dm, km), operator(+, -).
    Intre fiecare din elementele anterioare poate fi doar un singur spatiu, la inceputul expresiei nici un spatiu, iar la finalul expresiei oricate spatii.
    Numarul poate fi de format double(ex: "10.456") sau int, short etc (ex: "10").
    Se poate calcula si fara unitate de masura, iar pentru fiecare numar din expresie pentru care nu s-a specificat unitatea de masura, metoda va calcula direct in unitatea de masura specifica metodei.
    Dupa orice operator introdus obligatoriu trebuie introdus urmatorul numar.
    Orice abatere la cele mentionate mai sus, main-ul va da eroare.
    */
    public static void main(String[] args) {
        UnitCalculator calculator = new UnitCalculator("10 cm + 1 m - 10 mm + 1 km      ");

        calculator.mmCalculator();
        System.out.println("Rezultaul este: " + calculator.getResult() + " mm");

        calculator.cmCalculator();
        System.out.println("Rezultaul este: " + calculator.getResult() + " cm");

        calculator.dmCalculator();
        System.out.println("Rezultaul este: " + calculator.getResult() + " dm");

        calculator.mCalculator();
        System.out.println("Rezultaul este: " + calculator.getResult() + " m");

        calculator.kmCalculator();
        System.out.println("Rezultaul este: " + calculator.getResult() + " km");

    }
}
