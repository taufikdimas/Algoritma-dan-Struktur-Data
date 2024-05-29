package Tugas1;

import java.util.Scanner;

public class AntrianVaksinasiMain {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        AntrianVaksinasi dll = new AntrianVaksinasi();

        while (true) {
            System.out.println("==================================");
            System.out.println("| PENGANTRI VAKSIN EXTRAVAGANZA |");
            System.out.println("==================================");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengganti Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("==================================");
            System.out.print("Pilih: ");
            int choice = sc26.nextInt();
            sc26.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Data Penerima Vaksin\n");
                    System.out.print("Nomor Antrian: ");
                    int nomor = sc26.nextInt();
                    sc26.nextLine();
                    System.out.print("Nama Penerima: ");
                    String nama = sc26.nextLine();
                    dll.addLast(nomor, nama);
                    break;

                case 2:
                    try {
                        dll.removeFirst();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    dll.print();
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan ini.");
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}