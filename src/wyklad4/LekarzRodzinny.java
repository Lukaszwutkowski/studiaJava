package wyklad4;

public class LekarzRodzinny extends Osoba{

    private double liczbaZapisanychPacjentow;
    public LekarzRodzinny(String imie, String nazwisko, double liczbaZapisanychPacjentow) {
        super(imie, nazwisko); // to jest wywolanie konstruktora z klasy Osoba
        this.liczbaZapisanychPacjentow = liczbaZapisanychPacjentow;
    }

    @Override
    public void Drukuj() {
        super.Drukuj();
        System.out.println("Liczba zapisanych pacjentow: " + liczbaZapisanychPacjentow);
    }

    public double IleDoWyplaty(){
        return this.liczbaZapisanychPacjentow * new ParametryFinansowe().GetKwotaZaPacjentaPodsawowegoKontaktu();
    }
}
