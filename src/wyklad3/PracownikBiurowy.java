package wyklad3;
//Pracownik biurowy jest pracownikiem zatem moze dziedziczyc po pracowniku
class PracownikBiurowy extends Pracownik {

    private String numerBiura;

    public PracownikBiurowy(String imie, String nazwisko, int id, String numerBiura) {
        super(imie, nazwisko, id);
        this.numerBiura = numerBiura;
    }

    public void drukuj(){
        super.drukuj();
        System.out.println("Numer Biura: " + numerBiura);
    }
}
