package wyklad4;

public class Osoba {

    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void Drukuj(){
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
    }
}
