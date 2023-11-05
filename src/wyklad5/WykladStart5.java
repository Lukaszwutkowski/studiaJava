package wyklad5;

public class WykladStart5 {

    public static void main(String[] args) {

        ProjektAudytorski projektAudytorski =
                new ProjektAudytorski("Projekt 1", "Opis 1", 100, 1, 1);

        projektAudytorski.DrukujUmowe();

        ProjektProgramistyczny projektProgramistyczny =
                new ProjektProgramistyczny("Projekt 2", "Opis 2", 200,
                        2, 2,
                        2, 2, 2);

        projektProgramistyczny.DrukujUmowe();

        ProjektProgramistycznyZHelpDeskiem projektProgramistycznyZHelpDeskiem =
                new ProjektProgramistycznyZHelpDeskiem("Projekt 3", "Opis 3", 300,
                        3, 3,
                        3, 3,
                        3, 3);

        projektProgramistycznyZHelpDeskiem.DrukujUmowe();
    }
}
