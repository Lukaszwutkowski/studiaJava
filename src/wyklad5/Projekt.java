package wyklad5;

public class Projekt {

    private String tytul;
    private String opis;
    protected  double kosztyDodatkowe;

    public Projekt(String tytul, String opis, double kosztyDodatkowe) {
        this.tytul = tytul;
        this.opis = opis;
        this.kosztyDodatkowe = kosztyDodatkowe;
    }

    public void DaneProjektu(){
        System.out.println("Dane projektu");
        System.out.println("Tytul: " + tytul);
        System.out.println("Opis: " + opis);
        System.out.println("Koszty dodatkowe: " + kosztyDodatkowe);
    }
}
