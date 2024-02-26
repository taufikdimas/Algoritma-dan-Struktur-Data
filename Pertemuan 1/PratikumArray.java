import java.util.Scanner;

public class PratikumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // deklarasi variabel
        String[] namaMatakuliah = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        int[] nilaiAngka = new int[8];
        String[] nilaiHuruf = new String[nilaiAngka.length];
        double[] nilaiSetara = new double[nilaiAngka.length];
        int[] bobotSKS = { 2, 3, 3, 3, 2, 3, 2, 2 }; // SKS (contoh)

        // Input nilai matkul
        for (int i = 0; i < nilaiAngka.length; i++) {
            System.out.print("Masukkan nilai angka untuk mata kuliah " + namaMatakuliah[i] + ": ");
            nilaiAngka[i] = scanner.nextInt();

            // konversi nilai
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }
        }

        // hitung ip
        double totalSKS = 0;
        double totalBobotSKS = 0;
        for (int i = 0; i < bobotSKS.length; i++) {
            totalSKS += bobotSKS[i];
            totalBobotSKS += bobotSKS[i] * nilaiSetara[i];
        }

        double ipSemester = totalBobotSKS / totalSKS;

        System.out.println("=====================================================================================");
        System.out.println("| Mata Kuliah                            | Nilai Angka | Nilai Huruf | Nilai Setara |");
        System.out.println("=====================================================================================");
        for (int i = 0; i < namaMatakuliah.length; i++) {
            System.out.printf("| %-38s | %-11d | %-11s | %-12.2f |\n", namaMatakuliah[i], nilaiAngka[i], nilaiHuruf[i],
                    nilaiSetara[i]);
        }
        System.out.println("=====================================================================================");

        System.out.println("IP Semester : " + ipSemester);

        scanner.close();
        // tes
    }
}
