package wyklad5;

//Jezeli klasa zawiera conajmniej jedna metode abstrakcyjna to musi byc abstrakcyjna
public abstract class Projekt {

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

    //Jezeli nie wiemy jak napisac dana funkcje w klasie w ktorej jestesmy, natomiast
    //wiemy jak w klasie dziedziczacej to warto w tej pierwszej klasie zrobic ja abstrakcyjna
    public abstract double Wycena();
}
