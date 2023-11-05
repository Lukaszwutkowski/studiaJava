package wyklad5;

public class Umowa {

    public void DrukujUmowe(Projekt p){
        System.out.println();
        System.out.println("======Umowa======");
        System.out.println("Dane projektu: ");
        p.DaneProjektu();
        System.out.println("Kwota za realizacje: " + p.Wycena());
    }

}
