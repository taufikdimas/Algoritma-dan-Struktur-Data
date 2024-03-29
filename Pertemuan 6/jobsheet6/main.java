package jobsheet6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        DaftarMahasiswaBerprestasi_26 list = new DaftarMahasiswaBerprestasi_26();
        Mahasiswa_26 m1 = new Mahasiswa_26("Nusa", 2017, 25, 3);
        Mahasiswa_26 m2 = new Mahasiswa_26("Rara", 2012, 19, 4);
        Mahasiswa_26 m3 = new Mahasiswa_26("Dompu", 2018, 19, 3.5);
        Mahasiswa_26 m4 = new Mahasiswa_26("Abdul", 2017, 23, 2);
        Mahasiswa_26 m5 = new Mahasiswa_26("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting : ");
        list.tampil();

        // percobaan 1
        System.out.println("Data Mahasiswa setelah sorting desc berdasarkan IPK :");
        list.bubbleSort();
        list.tampil();

        // percobaan 2
        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan IPK :");
        list.selectionSort();
        list.tampil();

        // percobaan 3
        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan IPK :");
        list.insertionSort();
        list.tampil();
    }
}
