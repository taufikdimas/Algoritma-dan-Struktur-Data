import java.util.Scanner;

public class PratikumPemilihan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        // Input nilai
        System.out.print("Masukkan nilai tugas : ");
        int nilaiTugas = scanner.nextInt();
        System.out.print("Masukkan nilai kuis  : ");
        int nilaiKuis = scanner.nextInt();
        System.out.print("Masukkan nilai UTS   : ");
        int nilaiUTS = scanner.nextInt();
        System.out.print("Masukkan nilai UAS   : ");
        int nilaiUAS = scanner.nextInt();
        System.out.println("===============================");
        System.out.println("===============================");

        // Validasi nilai

        if (nilaiTugas > 100 || nilaiKuis > 100 || nilaiUTS > 100 || nilaiUAS > 100 || nilaiTugas < 0 || nilaiKuis < 0
                || nilaiUTS < 0 || nilaiUAS < 0) {
            System.out.println("Nilai tidak valid!");
            System.out.println("===============================");
            System.out.println("===============================");

            return;

        }

        // Hitung Nilai
        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

        // Konversi nilai ke huruf
        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 55) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 45) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        // Output

        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);

        // Keterangan lulus/tidak lulus
        String keterangan;
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") ||
                nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            keterangan = "LULUS";
        } else {
            keterangan = "TIDAK LULUS";
        }

        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("Keterangan: " + keterangan);

    }
}
