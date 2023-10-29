package wyklad1;

class KontoBankowe {

    private String nazwaBanku;
    private String numer;

    public KontoBankowe(String nazwaBanku, String numer) {
        this.nazwaBanku = nazwaBanku;
        this.numer = numer;
    }

    public void drukuj(){
        System.out.println("Nazwa Banku: " + nazwaBanku);
        System.out.println("Numer konta bankowego: " + numer);
    }
}
