package wyklad3;

// Pracownik dziedziczy po osobie
class Pracownik extends Osoba{

    private int id;

    public Pracownik(String imie, String nazwisko, int id) {
        super(imie, nazwisko);
        this.id = id;

    }

    public void drukuj(){
        System.out.println("Numer Id pracownika: " + id);
        System.out.println("Dane personalne pracownika: ");
        super.drukuj();
    }
}
