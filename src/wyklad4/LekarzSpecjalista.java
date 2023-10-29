package wyklad4;

public class LekarzSpecjalista extends Osoba{

    private double LiczbaPrzyjetychPacjentow;

    public LekarzSpecjalista(String imie, String nazwisko, double liczbaPrzyjetychPacjentow){
        super(imie, nazwisko);
        this.LiczbaPrzyjetychPacjentow = liczbaPrzyjetychPacjentow;
    }

    @Override
    public void Drukuj() {
        super.Drukuj();
        System.out.println("Liczba przyjetych pacjentow: " + LiczbaPrzyjetychPacjentow);
    }

    public double IleDoWyplaty(){
        return this.LiczbaPrzyjetychPacjentow * new ParametryFinansowe().GetKwotaZaPrzyjetegoPacjentaDlaSpecjalisty();
    }
}
