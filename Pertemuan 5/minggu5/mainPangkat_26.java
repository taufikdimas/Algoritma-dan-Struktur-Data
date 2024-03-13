package minggu5;

import java.util.Scanner;

public class mainPangkat_26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.println("=====================");
        System.out.print("Masukkan jumlah elemen yang di hitung : ");
        int elemen = sc26.nextInt();

        Pangkat_26[] png = new Pangkat_26[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat_26(2, 5);// modifikasi menggunakan konstruktor
            System.out.print("Masukkan nilai yang hendak dipangkatkan : ");
            png[i].nilai = sc26.nextInt();
            System.out.print("Masukkan nilai pangkat : ");
            png[i].pangkat = sc26.nextInt();
        }

        System.out.println("Hasil Pangkat - Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println(" Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("Hasil Pangkat - Divide Conqueror");
        for (int i = 0; i < elemen; i++) {
            System.out.println(" Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }

    }
}
