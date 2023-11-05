package wyklad5;

public class Umowa {

    public void DrukujUmowe(IObiektDoUmowy p){
        System.out.println();
        System.out.println("======Umowa======");
        System.out.println("Dane projektu: ");
        p.Dane();
        System.out.println("Kwota za realizacje: " + p.Wycena());
    }

}
