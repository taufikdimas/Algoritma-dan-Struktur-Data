/**
 * Buku27
 */
public class Buku27 {
    String judul, pengarang;
    int halaman, stok, harga, terjual;

    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga : Rp " + harga);

    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            terjual = jml;
        } else {
            System.out.println("Maaf, stok tidak mencukupi");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku27() {

    }

    public Buku27(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    int hitungHargaTotal() {
        int hargaTotal = terjual * harga;
        return hargaTotal;
    }

    int hitungDiskon() {
        int total = hitungHargaTotal();
        int diskon = 0;
        if (total > 150000) {
            diskon = (int) (total * 0.12);
        } else if (total > 75000) {
            diskon = (int) (total * 0.05);
        } else {
            diskon = 0;
        }
        return diskon;
    }

    int hitungHargaBayar() {
        int total = hitungHargaTotal();
        int diskon = hitungDiskon();
        int bayar = total - diskon;
        return bayar;
    }

}
