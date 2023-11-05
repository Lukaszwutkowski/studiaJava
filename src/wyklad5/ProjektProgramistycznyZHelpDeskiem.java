package wyklad5;

public class ProjektProgramistycznyZHelpDeskiem extends ProjektProgramistyczny{

    private double licbaGodzinHelpdesku;

    public ProjektProgramistycznyZHelpDeskiem(String tytul, String opis, double kosztyDodatkowe,
                                              double liczbaOsoboMiesiecyMlodszychProgramistow,
                                              double liczbaOsoboMiesiecyProgramistow,
                                              double liczbaOsoboMiesiecyStarszychProgramistow,
                                              double liczbaOsoboMiesiecyProjektantow,
                                              double liczbaOsoboMiesiecyTesterow, double licbaGodzinHelpdesku) {
        super(tytul, opis, kosztyDodatkowe, liczbaOsoboMiesiecyMlodszychProgramistow, liczbaOsoboMiesiecyProgramistow, liczbaOsoboMiesiecyStarszychProgramistow, liczbaOsoboMiesiecyProjektantow, liczbaOsoboMiesiecyTesterow);
        this.licbaGodzinHelpdesku = licbaGodzinHelpdesku;
    }

    @Override
    public void Dane() {
        super.Dane();
        System.out.println("Licba godzin Helpdesku: " + licbaGodzinHelpdesku);
    }

    @Override
    public double Wycena() {
        return super.Wycena() + licbaGodzinHelpdesku * new WynagrodzeniaB().ObliczSredniaPlaceHelpdesku();
    }
}
