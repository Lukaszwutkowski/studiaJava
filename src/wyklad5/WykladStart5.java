package wyklad5;

public class WykladStart5 {

    public static void main(String[] args) {

        Umowa umowa = new Umowa();

        ProjektAudytorski projektAudytorski =
                new ProjektAudytorski("Projekt 1", "Opis 1", 100, 1, 1);

        umowa.DrukujUmowe(projektAudytorski);

        ProjektProgramistyczny projektProgramistyczny =
                new ProjektProgramistyczny("Projekt 2", "Opis 2", 200,
                        2, 2,
                        2, 2, 2);

        umowa.DrukujUmowe(projektProgramistyczny);

        ProjektProgramistycznyZHelpDeskiem projektProgramistycznyZHelpDeskiem =
                new ProjektProgramistycznyZHelpDeskiem("Projekt 3", "Opis 3", 300,
                        3, 3,
                        3, 3,
                        3, 3);

        umowa.DrukujUmowe(projektProgramistycznyZHelpDeskiem);
    }
}
