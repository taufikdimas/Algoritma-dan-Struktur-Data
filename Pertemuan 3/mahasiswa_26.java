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

        // Tampilkan data mahasiswa
        System.out.println("\n\nData Mahasiswa");
        for (int i = 0; i < 3; i++) {
            System.out.println("---------------------");
            System.out.println("Nama: " + nama[i]);
            System.out.println("NIM: " + nim[i]);
            System.out.println("Jenis Kelamin: " + jenisKelamin[i]);
            System.out.println("IPK: " + ipk[i]);
        }
    }
}
