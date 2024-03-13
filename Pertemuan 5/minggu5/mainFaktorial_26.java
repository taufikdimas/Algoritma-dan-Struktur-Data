package minggu5;

import java.util.Scanner;

/**
 * mainFaktorial_26
 */
public class mainFaktorial_26 {

    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.println("----------------");
        System.out.print("Masukkan jumlah elemen : ");
        int iJml = sc26.nextInt();

        Faktorial_26[] fk = new Faktorial_26[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial_26();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + ":");
            int iNilai = sc26.nextInt();
            fk[i].nilai = iNilai;// perbaikan : mengatur nilai anggota variabel
        }

        System.out.println("Hasil-Brute Force");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan Brute Force adalah = " + fk[i].faktorialBF(fk[i].nilai));

        }
        System.out.println("Hasil-Divide Conqueror");
        for (int i = 0; i < iJml; i++) {
            System.out
                    .println(
                            "Hasil Perhitungan Menggunakan Divide and Queror adlah = "
                                    + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}