package wyklad4;

// Jezeli Osoba implementuje IObiektZKontraktem to zeby nie byla abstrakcyjna musi miec zrealizowane
//wszystkie metody z interfejsu czyli Drukuj() i IleDoWyplaty() lub klasa musi byc abstrakcyjna
public abstract class Osoba {

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

    public abstract double IleDoWyplaty();

    public void DrukujPoleceniePrzelewu(){
        System.out.println("POLECENIE PRZELEWU: ");
        Drukuj();
        System.out.println("Kwota przelewu: " + IleDoWyplaty());
        System.out.println();
    }
}
