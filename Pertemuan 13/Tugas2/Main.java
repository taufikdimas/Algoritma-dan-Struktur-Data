package Tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DaftarFilm daftarFilm = new DaftarFilm();
        Scanner sc26 = new Scanner(System.in);

        while (true) {
            System.out.println("=====================================");
            System.out.println("|        Data Film Layar Lebar      |");
            System.out.println("=====================================");
            System.out.println("Menu:");
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data pada indeks tertentu");
            System.out.println("4. Hapus data pertama");
            System.out.println("5. Hapus data terakhir");
            System.out.println("6. Hapus data pada indeks tertentu");
            System.out.println("7. Cetak data");
            System.out.println("8. Cari film berdasarkan ID");
            System.out.println("9. Urutan Data Rating Film-Desc");
            System.out.println("10. Keluar");
            System.out.println("=====================================");
            System.out.print("Pilihan: ");
            int choice = sc26.nextInt();
            sc26.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal ");
                    System.out.print("Masukkan ID film: ");
                    int id1 = sc26.nextInt();
                    sc26.nextLine();
                    System.out.print("Masukkan judul film: ");
                    String judul1 = sc26.nextLine();
                    System.out.print("Masukkan rating film: ");
                    double rating1 = Double.parseDouble(sc26.nextLine().replace(",", "."));
                    daftarFilm.addFirst(id1, judul1, rating1);
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir ");
                    System.out.print("Masukkan ID film: ");
                    int id2 = sc26.nextInt();
                    sc26.nextLine();
                    System.out.print("Masukkan judul film: ");
                    String judul2 = sc26.nextLine();
                    System.out.print("Masukkan rating film: ");
                    double rating2 = Double.parseDouble(sc26.nextLine().replace(",", "."));
                    daftarFilm.addLast(id2, judul2, rating2);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film Posisi Tertentu ");
                    System.out.print("Masukkan No. Urutan: ");
                    int index3 = sc26.nextInt();
                    sc26.nextLine();
                    System.out.print("Masukkan ID film: ");
                    int id3 = sc26.nextInt();
                    sc26.nextLine();
                    System.out.print("Masukkan judul film: ");
                    String judul3 = sc26.nextLine();
                    System.out.print("Masukkan rating film: ");
                    double rating3 = Double.parseDouble(sc26.nextLine().replace(",", "."));
                    daftarFilm.insertAt(index3, id3, judul3, rating3);
                    break;
                case 4:
                    daftarFilm.removeFirst();
                    break;
                case 5:
                    daftarFilm.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan No. Urutan yang ingin dihapus: ");
                    int index6 = sc26.nextInt();
                    sc26.nextLine();
                    daftarFilm.removeAt(index6);
                    break;
                case 7:
                    daftarFilm.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID film yang ingin dicari: ");
                    int searchId = sc26.nextInt();
                    Node26 foundFilm = daftarFilm.CariId(searchId);
                    if (foundFilm != null) {
                        System.out.println("Film ditemukan:");
                        System.out.println("ID: " + foundFilm.id);
                        System.out.println("Judul: " + foundFilm.judul);
                        System.out.println("Rating: " + foundFilm.rating);
                    } else {
                        System.out.println("Film dengan ID " + searchId + " tidak ditemukan.");
                    }
                    break;
                case 9:
                    daftarFilm.sortRatingDesc();
                    System.out.println("Data telah diurutkan berdasarkan rating secara descending.");
                    daftarFilm.print();
                    break;
                case 10:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
