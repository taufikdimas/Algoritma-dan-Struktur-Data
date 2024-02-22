public class BukuMain27 {
    public static void main(String[] args) {
        Buku27 bk1 = new Buku27();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku27 bk2 = new Buku27("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku27 bukuTaufik = new Buku27("One Piece", "Eiichiro Oda", 214, 10, 50000);
        bukuTaufik.tampilInformasi();
        bukuTaufik.terjual(5);

        System.out.println("Total Harga : " + bukuTaufik.hitungHargaTotal());
        System.out.println("Diskon : " + bukuTaufik.hitungDiskon());
        System.out.println("Total Bayar : " + bukuTaufik.hitungHargaBayar());
    }
}
