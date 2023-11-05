package wyklad5;

public class Umowa {

    public void DrukujUmowe(ProjektAudytorski p){
        System.out.println();
        System.out.println("======Umowa======");
        System.out.println("Dane projektu: ");
        p.DaneProjektu();
        System.out.println("Kwota za realizacje: " + p.Wycena());
    }

    public void DrukujUmowe(ProjektProgramistyczny p){
        System.out.println();
        System.out.println("======Umowa======");
        System.out.println("Dane projektu: ");
        p.DaneProjektu();
        System.out.println("Kwota za realizacje: " + p.Wycena());
    }

    public void DrukujUmowe(ProjektProgramistycznyZHelpDeskiem p){
        System.out.println();
        System.out.println("======Umowa======");
        System.out.println("Dane projektu: ");
        p.DaneProjektu();
        System.out.println("Kwota za realizacje: " + p.Wycena());
    }
}
