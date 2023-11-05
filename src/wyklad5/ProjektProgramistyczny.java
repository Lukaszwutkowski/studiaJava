package wyklad5;

public class ProjektProgramistyczny extends Projekt{

    private double liczbaOsoboMiesiecyMlodszychProgramistow;
    private double liczbaOsoboMiesiecyProgramistow;
    private double liczbaOsoboMiesiecyStarszychProgramistow;
    private double liczbaOsoboMiesiecyProjektantow;
    private double liczbaOsoboMiesiecyTesterow;

    public ProjektProgramistyczny(String tytul, String opis, double kosztyDodatkowe,
                                  double liczbaOsoboMiesiecyMlodszychProgramistow,
                                  double liczbaOsoboMiesiecyProgramistow,
                                  double liczbaOsoboMiesiecyStarszychProgramistow,
                                  double liczbaOsoboMiesiecyProjektantow, double liczbaOsoboMiesiecyTesterow) {
        super(tytul, opis, kosztyDodatkowe);
        this.liczbaOsoboMiesiecyMlodszychProgramistow = liczbaOsoboMiesiecyMlodszychProgramistow;
        this.liczbaOsoboMiesiecyProgramistow = liczbaOsoboMiesiecyProgramistow;
        this.liczbaOsoboMiesiecyStarszychProgramistow = liczbaOsoboMiesiecyStarszychProgramistow;
        this.liczbaOsoboMiesiecyProjektantow = liczbaOsoboMiesiecyProjektantow;
        this.liczbaOsoboMiesiecyTesterow = liczbaOsoboMiesiecyTesterow;
    }

    @Override
    public void DaneProjektu() {
        super.DaneProjektu();
        System.out.println("Liczba Osobo-Miesiecy Mlodszych Programistow: " + liczbaOsoboMiesiecyMlodszychProgramistow);
        System.out.println("Liczba Osobo-Miesiecy Programistow: " + liczbaOsoboMiesiecyProgramistow);
        System.out.println("Liczba Osobo-Miesiecy Starszych Programistow: " + liczbaOsoboMiesiecyStarszychProgramistow);
        System.out.println("Liczba Osobo-Miesiecy Projektantow: " + liczbaOsoboMiesiecyProjektantow);
        System.out.println("Liczba Osobo-Miesiecy Testerow: " + liczbaOsoboMiesiecyTesterow);
    }

    public double Wycena(){
        WynagrodzeniaB wynagrodzeniaB = new WynagrodzeniaB();
        return liczbaOsoboMiesiecyMlodszychProgramistow * wynagrodzeniaB.ObliczSredniaPlaceMlodszychProgramistow()
                + liczbaOsoboMiesiecyProgramistow * wynagrodzeniaB.ObliczSredniaPlaceProgramistow()
                + liczbaOsoboMiesiecyStarszychProgramistow * wynagrodzeniaB.ObliczSredniaPlaceStarszychProgramistow()
                + liczbaOsoboMiesiecyProjektantow * wynagrodzeniaB.ObliczSredniaPlaceProjektantow()
                + liczbaOsoboMiesiecyTesterow * wynagrodzeniaB.ObliczSredniaPlaceTesterow()
                + kosztyDodatkowe;
    }
}
