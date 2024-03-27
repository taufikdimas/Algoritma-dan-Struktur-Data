package P7;

import java.util.Scanner;

public class BukuMain26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        pencarianBuku26 data = new pencarianBuku26();
        int jumBuku = 5;

        System.out.println("===================================");
        System.out.println("Masukkan data Buku secara Urut dari Kodebuku terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("========================");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t:");
            int stock = s.nextInt();

            Buku26 m = new Buku26(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("===================================");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("===================================");
        System.out.println("Pencarian Data  ");
        System.out.println("Masukkan Kode Buku yang dicari  ");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential Search ");
        int posisi = data.FindSeqsearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilkanData(cari, posisi);

        System.out.println("===================================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilkanData(cari, posisi);
    }

}
