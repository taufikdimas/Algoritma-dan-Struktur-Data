package minggu5;

// import java.util.Scanner;

// public class mainSum_26 {
//     public static void main(String[] args) {
//         Scanner sc26 = new Scanner(System.in);
//         System.out.println("===============================");
//         System.out.println("Program Menghitung Keuntungan Total (Satuan Juta ex:5.9)");
//         System.out.print("Masukkan jumlah Bulan : ");
//         int elm = sc26.nextInt();

//         Sum_26 sm = new Sum_26(elm);
//         System.out.println("============================");
//         for (int i = 0; i < sm.elemen; i++) {
//             System.out.print("Masukkan untung bulan ke - " + (i + 1) + " = ");
//             sm.keuntungan[i] = sc26.nextDouble();
//         }

//         System.out.println("================================");
//         System.out.println("Algoritma Brute Force");
//         System.out.println(
//                 "Total keuntungan perusahaan selama " + sm.elemen + "bulan adalah = " + sm.totalBF(sm.keuntungan));
//         System.out.println("================================");
//         System.out.println("Algoritme Divide Conquer");
//         System.out.println("Total keuntungan perusahaan selama " + sm.elemen + "bulan adalah = "
//                 + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));

//     }
// }
import java.util.Scanner;

public class mainSum_26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);

        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc26.nextInt();
        System.out.print("Masukkan jumlah bulan: ");
        int jumlahBulan = sc26.nextInt();

        double[][] keuntunganPerusahaan = new double[jumlahPerusahaan][jumlahBulan];

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Perusahaan " + (i + 1) + ":");
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("Masukkan keuntungan bulan " + (j + 1) + " (dalam juta): ");
                keuntunganPerusahaan[i][j] = sc26.nextDouble();
            }
        }

        for (int i = 0; i < jumlahPerusahaan; i++) {
            double totalKeuntungan = 0;
            for (int j = 0; j < jumlahBulan; j++) {
                totalKeuntungan += keuntunganPerusahaan[i][j];
            }
            System.out.println("Total keuntungan perusahaan " + (i + 1) + " adalah: " + totalKeuntungan + " juta");
        }

        sc26.close();
    }
}