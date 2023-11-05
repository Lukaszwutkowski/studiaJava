package wyklad5;

public class ProjektAudytorski extends Projekt{

    private double liczbaOsoboMiesiecySpecjalisty;
    private double liczbaOsoboboMiesiecyStarszegoSpecjalisty;

    public ProjektAudytorski(String tytul, String opis, double kosztyDodatkowe,
                             double liczbaOsoboMiesiecySpecjalisty, double liczbaOsoboboMiesiecyStarszegoSpecjalisty)
    {
        super(tytul, opis, kosztyDodatkowe);
        this.liczbaOsoboMiesiecySpecjalisty = liczbaOsoboMiesiecySpecjalisty;
        this.liczbaOsoboboMiesiecyStarszegoSpecjalisty = liczbaOsoboboMiesiecyStarszegoSpecjalisty;
    }

    public void Dane(){
        super.Dane();
        System.out.println("Liczba Osobo-Miesiecy Specjalisty: " + liczbaOsoboMiesiecySpecjalisty);
        System.out.println("Liczba Osobo-Miesiecy Starszego Specjalisty: " + liczbaOsoboboMiesiecyStarszegoSpecjalisty);
    }

    public double Wycena(){
        return liczbaOsoboMiesiecySpecjalisty * new WynagrodzeniaB().ObliczSredniaPlaceSpecjalistow() +
                liczbaOsoboboMiesiecyStarszegoSpecjalisty * new WynagrodzeniaB().ObliczSredniaPlaceStarszychSpecjalistow()
                + kosztyDodatkowe;
    }
}
