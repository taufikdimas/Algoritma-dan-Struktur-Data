package P7;

import java.util.Arrays;
import java.util.Scanner;

public class BukuMain26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        pencarianBuku26 data = new pencarianBuku26();
        int jumBuku = 5;

        System.out.println("===================================");
        System.out.println("Masukkan data Buku secara Urut dari Kodebuku terkecil :");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("========================");
            System.out.print("Kode Buku \t: ");
            String kodeBuku = s.nextLine();
            System.out.print("Judul Buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t:");
            int stock = s.nextInt();
            s.nextLine();

            Buku26 m = new Buku26(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("===================================");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("===================================");
        System.out.println("Pencarian Data ");
        System.out.println("Masukkan Kode Buku yang dicari ");
        System.out.print("Kode Buku : ");
        String cariKodeBuku = s.nextLine();

        System.out.println("Pencarian Kode Buku menggunakan Binary Search");
        int posisiKodeBukuBinary = data.findBinarySearch(cariKodeBuku, 0, jumBuku - 1);
        data.Tampilposisi(cariKodeBuku, posisiKodeBukuBinary);
        data.TampilkanData(cariKodeBuku, posisiKodeBukuBinary);

        System.out.println("Pencarian Kode Buku menggunakan Sequential Search");
        int posisiKodeBukuSequential = data.findSeqsearch(cariKodeBuku);
        data.Tampilposisi(cariKodeBuku, posisiKodeBukuSequential);
        data.TampilkanData(cariKodeBuku, posisiKodeBukuSequential);

        System.out.println("===================================");
        System.out.println("Pencarian Judul Buku ");
        System.out.println("Masukkan Judul Buku yang dicari ");
        System.out.print("Judul Buku : ");
        String cariJudulBuku = s.nextLine();

        System.out.println("Pencarian Judul Buku menggunakan Binary Search");
        int posisiJudulBukuBinary = data.findBinarySearchJudul(cariJudulBuku, 0, jumBuku - 1);
        if (posisiJudulBukuBinary != -1) {
            System.out.println("Judul buku ditemukan pada indeks: " + posisiJudulBukuBinary);
            System.out.println("Data buku dengan judul yang sama:");
            for (int i = posisiJudulBukuBinary; i < data.idx; i++) {
                if (data.listBK[i].judulBuku.equalsIgnoreCase(cariJudulBuku)) {
                    data.listBK[i].tampilDataBuku();
                } else {
                    break;
                }
            }
        } else {
            System.out.println("Judul buku tidak ditemukan.");
        }

        System.out.println("Pencarian Judul Buku menggunakan Sequential Search");
        int jumlahJudulBukuSequential = data.findSeqSearchJudul(cariJudulBuku);
        if (jumlahJudulBukuSequential > 0) {
            System.out.println("Ditemukan " + jumlahJudulBukuSequential + " buku dengan judul yang sama:");
            for (int i = 0; i < data.idx; i++) {
                if (data.listBK[i].judulBuku.equalsIgnoreCase(cariJudulBuku)) {
                    data.listBK[i].tampilDataBuku();
                }
            }
        } else {
            System.out.println("Judul buku tidak ditemukan.");
        }
    }
}
