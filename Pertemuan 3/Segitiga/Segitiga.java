package Segitiga;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        this.alas = a;
        this.tinggi = t;

    }

    public double hitungLuas() {
        return alas * tinggi / 2;
    }

    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
}
