import java.util.Scanner;

public class mahasiswa_26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        String[] nama = new String[3];
        String[] nim = new String[3];
        String[] jenisKelamin = new String[3];
        double[] ipk = new double[3];

        // Input data mahasiswa
        for (int i = 0; i < 3; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            nama[i] = sc.nextLine();
            System.out.print("NIM: ");
            nim[i] = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            jenisKelamin[i] = sc.nextLine();
            System.out.print("IPK: ");
            ipk[i] = sc.nextDouble();
            sc.nextLine();
        }

        // Hitung rata-rata
        double rataRataIPK = hitungRataRataIPK(ipk);

        // mahasiswa dengan IPK terbesar
        Mahasiswa mhsIPKTertinggi = MahasiswaIPKTertinggi(nama, nim, jenisKelamin, ipk);

        // Tampilkan data mahasiswa
        System.out.println("\n\nData Mahasiswa");
        for (int i = 0; i < 3; i++) {
            System.out.println("---------------------");
            System.out.println("Nama: " + nama[i]);
            System.out.println("NIM: " + nim[i]);
            System.out.println("Jenis Kelamin: " + jenisKelamin[i]);
            System.out.println("IPK: " + ipk[i]);
        }

        // Tampilkan rata-rata IPK
        System.out.println("\nRata-rata IPK: " + rataRataIPK);

        // Tampilkan data mahasiswa dengan IPK tertinggi
        System.out.println("\nMahasiswa dengan IPK Tertinggi:");
        System.out.println("Nama: " + mhsIPKTertinggi.nama);
        System.out.println("NIM: " + mhsIPKTertinggi.nim);
        System.out.println("Jenis Kelamin: " + mhsIPKTertinggi.jenisKelamin);
        System.out.println("IPK: " + mhsIPKTertinggi.ipk);
    }

    // Method untuk menghitung rata-rata IPK
    private static double hitungRataRataIPK(double[] ipk) {
        double totalIPK = 0;
        for (double d : ipk) {
            totalIPK += d;
        }
        return totalIPK / ipk.length;
    }

    // Method mencari mahasiswa dengan IPK terbesar
    private static Mahasiswa MahasiswaIPKTertinggi(String[] nama, String[] nim, String[] jenisKelamin,
            double[] ipk) {
        Mahasiswa mhsIPKTertinggi = new Mahasiswa(nama[0], nim[0], jenisKelamin[0], ipk[0]);
        for (int i = 1; i < ipk.length; i++) {
            if (ipk[i] > mhsIPKTertinggi.ipk) {
                mhsIPKTertinggi = new Mahasiswa(nama[i], nim[i], jenisKelamin[i], ipk[i]);
            }
        }
        return mhsIPKTertinggi;
    }

    // Class data mahasiswa
    private static class Mahasiswa {
        String nama;
        String nim;
        String jenisKelamin;
        double ipk;

        public Mahasiswa(String nama, String nim, String jenisKelamin, double ipk) {
            this.nama = nama;
            this.nim = nim;
            this.jenisKelamin = jenisKelamin;
            this.ipk = ipk;
        }

    }
}
