package wyklad2;

class Pracownik {

    private String imie;
    private String nazwisko;
    private int id;
    //Pole jest statyczne (klasowe) bo ma wspólną wartość dla wszystkich obiektów danej klasy (każdy pracownik ma tą samą wartość tego pola).
    private static int liczbaDodanychPracownikow = 0;

    // Ta funkcja jest statyczna (klasowa) poniewaz uzywa wylacznie pol klasowych i moze byc wywolywana na rzecz obiektu ale tez klasy
    public static int getLiczbaDodanychPracownikow(){
        return liczbaDodanychPracownikow;
    }

    public Pracownik(String imie, String nazwisko, int id) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = id;
        liczbaDodanychPracownikow++;
    }

    public void drukuj() {
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Id: " + id);
    }
}
