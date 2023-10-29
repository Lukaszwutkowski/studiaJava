package wyklad1;

class Pracownik {
    private String imie;
    private String nazwisko;
    private int id;
    private KontoBankowe kontoBankowe;


    public Pracownik(String imie, String nazwisko, int id, String kontoBankoweNazwaBanku, String kontoBankoweNumer) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = id;
        this.kontoBankowe = new KontoBankowe(kontoBankoweNazwaBanku, kontoBankoweNumer);
    }

    public void drukuj() {
        System.out.println("Dane podstawowe pracownika:");
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Id: " + id);
        System.out.println("Dane konta pracownika:");
        // To jest wywolanie metody z klasy KontoBankowe
        kontoBankowe.drukuj();
    }
}
