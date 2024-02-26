import java.util.Scanner;

public class Tugas2_27 {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 4);
    }

    public static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);
        double jarak, waktu;

        System.out.print("Masukkan jarak (km): ");
        jarak = scanner.nextDouble();
        System.out.print("Masukkan waktu (jam): ");
        waktu = scanner.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan adalah: " + kecepatan + " km/jam");
    }

    public static void hitungJarak() {
        Scanner scanner = new Scanner(System.in);
        double kecepatan, waktu;

        System.out.print("Masukkan kecepatan (km/jam): ");
        kecepatan = scanner.nextDouble();
        System.out.print("Masukkan waktu (jam): ");
        waktu = scanner.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.println("Jarak adalah: " + jarak + " km");
    }

    public static void hitungWaktu() {
        Scanner scanner = new Scanner(System.in);
        double jarak, kecepatan;

        System.out.print("Masukkan jarak (km): ");
        jarak = scanner.nextDouble();
        System.out.print("Masukkan kecepatan (km/jam): ");
        kecepatan = scanner.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Waktu adalah: " + waktu + " jam");
    }
    // tes
}
