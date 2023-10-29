package wyklad4;

public class Ksiegowosc {

    public void DrukujPoleceniePrzelewu(OsobaZKontraktem o){
        System.out.println("POLECENIE PRZELEWU: ");
        o.Drukuj();
        System.out.println("Kwota przelewu: " + o.IleDoWyplaty());
        System.out.println();
    }
}
