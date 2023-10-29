package wyklad2;

class Wyklad2 {
    public static void main(String[] args) {

        Pracownik p1 = new Pracownik("Adam", "Nowak", 1);
        p1.drukuj();
        System.out.println("Liczba pracownikow: " + Pracownik.getLiczbaDodanychPracownikow());
    }
}
