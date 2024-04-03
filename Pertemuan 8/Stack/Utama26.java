package Stack;

import java.util.Scanner;

public class Utama26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        Gudang26 gudang = new Gudang26(7);

        while (true) {
            System.out.println("\nMenu :");
            System.out.println("1. Tambahkan Barang ke Gudang");
            System.out.println("2. Ambil Barang dari Gudang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Keluar");
            System.out.print("Masukkan Pilihan : ");
            int pilihan = sc26.nextInt();
            sc26.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Barang: ");
                    int kode = sc26.nextInt();
                    sc26.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String nama = sc26.nextLine();
                    System.out.print("Masukkan Kategori : ");
                    String kategori = sc26.nextLine();
                    Barang26 barangBaru = new Barang26(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak valid, Silahkan coba lagi");
            }
        }
    }
}
