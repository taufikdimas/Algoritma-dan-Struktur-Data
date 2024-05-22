// Taufik Dimas | 2341720062 | 26 | TI - 1B
package Kuis2;

import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        MotoGP klasemen = new MotoGP();
        for (String nama : MotoGP.pembalapList) {
            klasemen.accPembalap(new Pembalap(nama));
        }

        Scanner sc26 = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Pertandingan");
            System.out.println("2. Tampilkan Klasemen");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc26.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Masukkan posisi setiap pembalap : ");
                    int[] posisiPembalap = new int[11];
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Posisi " + MotoGP.pembalapList[i] + ": ");
                        posisiPembalap[i] = sc26.nextInt();
                    }
                    klasemen.tambahPertandingan(posisiPembalap);
                    break;
                case 2:
                    klasemen.tampilkanKlasemen();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
    }
}