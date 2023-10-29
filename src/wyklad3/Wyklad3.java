package wyklad3;


class Wyklad3 {

    public static void main(String[] args) {

        Pracownik p1 = new Pracownik("Adam", "Nowak", 1);
        p1.drukuj();

        PracownikBiurowy pracownikBiurowy = new PracownikBiurowy("Anna", "Kowalska", 2, "B112");
        pracownikBiurowy.drukuj();
    }
}
