package wyklad4;

public class Wyklad4Start {

    public static void main(String[] args) {

        LekarzRodzinny lekarzRodzinny = new LekarzRodzinny("Adam", "Rodzinny", 100);
        lekarzRodzinny.DrukujPoleceniePrzelewu();

        LekarzSpecjalista lekarzSpecjalista = new LekarzSpecjalista("Adam", "Specjalista", 100);
        lekarzSpecjalista.DrukujPoleceniePrzelewu();
    }
}
