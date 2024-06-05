package Graph;

import java.util.Scanner;

public class GraphMain26 {
    public static void main(String[] args) throws Exception {
        Scanner sc26 = new Scanner(System.in);
        Graph26 gedung = new Graph26(6);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("8. Exit");
            System.out.print("Pilih menu: ");
            int choice = sc26.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Gedung Asal: ");
                    int asal = sc26.nextInt();
                    System.out.print("Masukkan Gedung Tujuan: ");
                    int tujuan = sc26.nextInt();
                    System.out.print("Masukkan Jarak: ");
                    int jarak = sc26.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan Gedung Asal: ");
                    asal = sc26.nextInt();
                    System.out.print("Masukkan Gedung Tujuan: ");
                    tujuan = sc26.nextInt();
                    gedung.removeEdge(asal, tujuan);
                    break;
                case 3:
                    System.out.print("Masukkan Gedung: ");
                    asal = sc26.nextInt();
                    gedung.degree(asal);
                    break;
                case 4:
                    gedung.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan Gedung Asal: ");
                    asal = sc26.nextInt();
                    System.out.print("Masukkan Gedung Tujuan: ");
                    tujuan = sc26.nextInt();
                    if (gedung.isTetangga(asal, tujuan)) {
                        System.out.println(
                                "Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
                    } else {
                        System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan)
                                + " tidak bertetangga");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan Gedung Asal: ");
                    asal = sc26.nextInt();
                    System.out.print("Masukkan Gedung Tujuan: ");
                    tujuan = sc26.nextInt();
                    System.out.print("Masukkan Jarak Baru: ");
                    jarak = sc26.nextInt();
                    gedung.updateJarak(asal, tujuan, jarak);
                    break;
                case 7:
                    System.out.println("Jumlah Edge dalam Graf: " + gedung.hitungEdge());
                    break;
                case 8:
                    sc26.close();
                    System.out.println("Program selesai.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
        // GraphMatriks26 gdg = new GraphMatriks26(4);
        // gdg.makeEdge(0, 1, 50);
        // gdg.makeEdge(1, 0, 60);
        // gdg.makeEdge(1, 2, 70);
        // gdg.makeEdge(2, 1, 80);
        // gdg.makeEdge(2, 3, 40);
        // gdg.makeEdge(3, 0, 90);
        // gdg.printGraph();
        // System.out.println("Hasil setelah penghapusan edge");
        // gdg.removeEdge(2, 1);
        // gdg.printGraph();
        // gdg.degree();

    }
}
