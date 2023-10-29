package wyklad4;

public class Wyklad4Start {

    public static void main(String[] args) {

        Ksiegowosc ksiegowosc = new Ksiegowosc();

        LekarzRodzinny lekarzRodzinny = new LekarzRodzinny("Adam", "Rodzinny", 100);
        ksiegowosc.DrukujPoleceniePrzelewu(lekarzRodzinny);

        LekarzSpecjalista lekarzSpecjalista = new LekarzSpecjalista("Adam", "Specjalista", 100);
        ksiegowosc.DrukujPoleceniePrzelewu(lekarzSpecjalista);
    }
}
