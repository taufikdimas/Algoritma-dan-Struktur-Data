package LatihanPratikum;

public class Hotel_26 {
    private String nama;
    private String kota;
    private int harga;
    private byte bintang;

    public Hotel_26(String n, String k, int h, byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    public int getHarga() {
        return harga;
    }

    public byte getBintang() {
        return bintang;
    }

    @Override
    public String toString() {
        return "Hotel: " + nama + ", Kota: " + kota + ", Harga: " + harga + ", Rating: " + bintang;
    }
}
