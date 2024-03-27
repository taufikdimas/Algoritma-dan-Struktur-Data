package P7;

public class Buku26 {
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String Pengarang;
    int stock;

    public Buku26(int kodeBuku, String judulBuku, int tahunTerbit, String Pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.Pengarang = Pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku() {
        System.out.println("======================");
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul Buku : " + judulBuku);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Pengarang : " + Pengarang);
        System.out.println("Stock : " + stock);
    }
}
