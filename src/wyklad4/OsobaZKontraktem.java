package wyklad4;

abstract class OsobaZKontraktem extends Osoba{

    public OsobaZKontraktem(String imie, String nazwisko) {
        super(imie, nazwisko);
    }
    public abstract double IleDoWyplaty();
}
