public class Konstruktor {

    public int sisi;

    public Konstruktor(int sisi) {
        this.sisi = sisi;
    }

    public Konstruktor() {
        this.sisi = 1;
    }

    public static void main(String[] args) {

        Konstruktor Persegi1 = new Konstruktor(5);
        Konstruktor Persegi2 = new Konstruktor();

        System.out.println("Persegi 1 :" + Persegi1.sisi);
        System.out.println("Persegi 2 :" + Persegi2.sisi);

    }
}