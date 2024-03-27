# <p align="center">JOBSHEET V - Sorting(Bubble, Sleection, Dan Insertion Sort)</p>

<br><br>

<p align="center">
 
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/82948574-8b73-4e17-be0a-4fd3d9c857bf)



</p>

<br><br>

<p align="center">
    Nama : Taufik Dimas Edystara <br>
    NIM : 2341720062 <br>
    Kelas : TI-1B <br>
    Prodi : D4 Teknik Informatika
</p>

***

## **5.2 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Bubble Sort**
### **5.2.1 Langkah-langkah Percobaan**

``` Class Mahasiswa```
``` java
package jobsheet6;

public class Mahasiswa_26 {
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa_26(String n, int t, int u, double i) {
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + thnMasuk);
        System.out.println("Umur: " + umur);
        System.out.println("IPK: " + ipk);
    }
}
```

``` class Main```
``` java
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

```

``` Class Daftar Mahasiswa Berprestasi```
``` java
package jobsheet6;

public class DaftarMahasiswaBerprestasi_26 {
    Mahasiswa_26 listMhs[] = new Mahasiswa_26[5];
    int idx;

    // method tambah()
    void tambah(Mahasiswa_26 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    // method tampil()
    void tampil() {
        for (Mahasiswa_26 m : listMhs) {
            m.tampil();
            System.out.println("===========================");
        }
    }

    // method bubbleSort()
    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 0; j < listMhs.length - i - 1; j++) {
                if (listMhs[j].ipk < listMhs[j + 1].ipk) {
                    Mahasiswa_26 tmp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = tmp;
                }
            }
        }
    }

    
}
```
### **5.2.2 Verifikasi Hasil Percobaan**
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/eefd4ed6-152d-4223-97f9-f229bb39851d)

### **5.2.3 Pertanyaan**
1. Terdapat di method apakah proses bubble sort?<br>
   ``` Proses Bubble Sort terdapat dalam method bubbleSort() dalam kelas DaftarMahasiswaBerprestasi_26```<br>
2. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini:<br>
``` java
if (listMhs[j].ipk < listMhs[j + 1].ipk) {
                    Mahasiswa_26 tmp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = tmp;
                }
```
   Untuk apakah proses tersebut?<br>
 ```  untuk pertukaran posisi dua elemen dalam array jika nilai IPK dari elemen saat ini lebih kecil daripada nilai IPK dari elemen berikutnya```<br>
 3. Perhatikan perulangan di dalam bubbleSort() di bawah ini:<br>
 ``` java
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 0; j < listMhs.length - i - 1; j++) {
```
a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j?<br>
 ```  Perulangan i digunakan untuk mengatur jumlah tahap dalam algoritma Bubble Sort, sedangkan perulangan j digunakan untuk membandingkan elemen-elemen dalam array pada setiap tahap.```<br>
b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?<br>
 ``` Syarat i < listMhs.length - 1 karena iterasi terakhir tidak perlu membandingkan elemen yang sudah terurut sebelumnya.```<br>
c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?<br>
 ```  Syarat j < listMhs.length - i karena pada setiap tahap, elemen terbesar yang sudah terurut tidak perlu dibandingkan lagi.```<br>
d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?<br>
 ``` Jika banyak data adalah 50, perulangan i akan berlangsung sebanyak 49 kali. Terdapat 49 tahap dalam Bubble Sort karena setiap iterasi i memindahkan satu elemen terbesar ke posisi akhir, sehingga elemen terakhir akan otomatis terurut setelah 49 iterasi.```

 ## **5.3 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Selection Sort**
### **5.3.1 Langkah-langkah Percobaan**
``` java
    // method selectionSort()
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa_26 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
```
``` java
 // percobaan 2
        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan IPK :");
        list.selectionSort();
        list.tampil();
```
### **5.3.2 Verifikasi Hasil Percobaan**
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/30cdb41e-5a18-40fc-b922-5b9349f946be)

### **5.3.3 Pertanyaan**
Di dalam method selection sort, terdapat baris program seperti di bawah ini:<br>
``` java
int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
```

Untuk apakah proses tersebut, jelaskan!<br>
``` Proses tersebut adalah pencarian indeks dari elemen dengan nilai IPK terkecil di dalam array listMhs mulai dari indeks i hingga indeks terakhir. Tujuannya adalah untuk menemukan elemen terkecil yang akan diposisikan pada tempat yang tepat setelah iterasi saat ini berakhir dalam algoritma Selection Sort.```<br>

 ## **5.4 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort**
### **5.4.1 Langkah-langkah Percobaan**
``` java
    // method insertionSort()
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa_26 tmp = listMhs[i];
            int j = i;
            while ((j > 0) && (listMhs[j - 1].ipk > tmp.ipk)) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = tmp;
        }
    }
```
``` java
        // percobaan 3
        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan IPK :");
        list.insertionSort();
        list.tampil();
```
### **5.4.2 Verifikasi Hasil Percobaan**
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/b2d13d02-ff74-4add-9775-17f62cf71cbe)

### **5.4.3 Pertanyaan**
Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending.<br>

``` java
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa_26 tmp = listMhs[i];
            int j = i;
            while ((j > 0) && (listMhs[j - 1].ipk < tmp.ipk)) { // ubah kondisi perbandiangan menjadi <
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = tmp;
        }
    }
```

## **5.5 Latihan Pratikum**
### **5.5.1 Langkah-langkah Percobaan**

``` class Hotel```
``` java
package LatihanPratikum;

public class Hotel_26 {
    private String nama;
    private String kota;
    private int harga;
    private byte bintang;

    public Hotel_26(String n, String k, int h, byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    public int getHarga() {
        return harga;
    }

    public byte getBintang() {
        return bintang;
    }

    @Override
    public String toString() {
        return "Hotel: " + nama + ", Kota: " + kota + ", Harga: " + harga + ", Rating: " + bintang;
    }
}
```

``` class Hotel Service```
``` java
package LatihanPratikum;

public class HotelService_26 {
    private Hotel_26[] rooms;
    private int size;

    public HotelService_26(int kapasitas) {
        rooms = new Hotel_26[kapasitas];
        size = 0;
    }

    public void tambah(Hotel_26 H) {
        if (size < rooms.length) {
            rooms[size++] = H;
        } else {
            System.out.println("penuh");
        }
    }

    public void tampilAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(rooms[i]);
        }
    }

    // sorting harga (bubble sort)
    public void bubbleSortHarga() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (rooms[j].getHarga() > rooms[j + 1].getHarga()) {
                    // swap
                    Hotel_26 temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    // sorting harga (selection sort)
    public void selectionSortHarga() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (rooms[j].getHarga() < rooms[minIndex].getHarga()) {
                    minIndex = j;
                }
            }
            // swap
            Hotel_26 temp = rooms[minIndex];
            rooms[minIndex] = rooms[i];
            rooms[i] = temp;
        }
    }

    // sorting Rating (selection sort)
    public void selectionSortRating() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (rooms[j].getBintang() > rooms[minIndex].getBintang()) {
                    minIndex = j;
                }
            }
            // swap
            Hotel_26 temp = rooms[minIndex];
            rooms[minIndex] = rooms[i];
            rooms[i] = temp;
        }
    }

    // sorting Rating (bubble sort)
    public void bubbleSortRating() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (rooms[j].getBintang() < rooms[j + 1].getBintang()) {
                    // swap
                    Hotel_26 temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }
}
```

``` class Main Hotel```
``` java
package LatihanPratikum;

import java.util.Scanner;

public class MainHotel_26 {
    public static void main(String[] args) {
        HotelService_26 hotelService = new HotelService_26(5);
        hotelService.tambah(new Hotel_26("A", "Jakarta  ", 580000, (byte) 4));
        hotelService.tambah(new Hotel_26("B", "Surabaya ", 400000, (byte) 3));
        hotelService.tambah(new Hotel_26("C", "Bali     ", 600000, (byte) 5));
        hotelService.tambah(new Hotel_26("D", "Malang   ", 450000, (byte) 2));
        hotelService.tambah(new Hotel_26("E", "Blitar   ", 750000, (byte) 1));

        Scanner sc26 = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nPilih opsi sorting:");
            System.out.println("1. Harga (dari termurah ke termahal)");
            System.out.println("2. Rating bintang (dari tertinggi ke terendah)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = sc26.nextInt();

            switch (choice) {
                case 1:
                    // hotelService.bubbleSortHarga();
                    hotelService.selectionSortHarga();
                    hotelService.tampilAll();
                    break;
                case 2:
                    // hotelService.selectionSortRating();
                    hotelService.bubbleSortRating();
                    hotelService.tampilAll();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (choice != 0);

        sc26.close();
    }
}
```
### **5.5.3 Verifikasi Hasil Percobaan**
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/8d653bd9-3e45-4257-8af8-a5edbb6913e3)

