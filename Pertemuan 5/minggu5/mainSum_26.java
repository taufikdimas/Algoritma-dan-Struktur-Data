package minggu5;

import java.util.Scanner;

public class mainSum_26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta ex:5.9)");
        System.out.print("Masukkan jumlah Bulan : ");
        int elm = sc26.nextInt();

        Sum_26 sm = new Sum_26(elm);
        System.out.println("============================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke - " + (i + 1) + " = ");
            sm.keuntungan[i] = sc26.nextDouble();
        }

        System.out.println("================================");
        System.out.println("Algoritma Brute Force");
        System.out.println(
                "Total keuntungan perusahaan selama " + sm.elemen + "bulan adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("================================");
        System.out.println("Algoritme Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + "bulan adalah = "
                + sm.totalDC(sm.keuntungan, 0, sm.elemen));

    }
}
