# <p align="center">JOBSHEET VI - Searching</p>

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

## **6.2. Searching / Pencarian Menggunakan Agoritma Sequential Search**
### **6.2.1. Langkah-langkah Percobaan Sequential Search**
``` Class Buku```
``` java
package P7;

public class Buku26 {
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String Pengarang;
    int stock;

    public Buku26(int kodeBuku, String judulBuku, int tahunTerbit, String Pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.Pengarang = Pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku() {
        System.out.println("======================");
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul Buku : " + judulBuku);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Pengarang : " + Pengarang);
        System.out.println("Stock : " + stock);
    }
}
```
``` Class Pencarian Buku```
``` java
package P7;

public class pencarianBuku26 {
    Buku26 listBK[] = new Buku26[5];
    int idx;

    void tambah(Buku26 m) {
        if (idx < listBK.length) {
            listBK[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            Buku26 m = listBK[i];
            m.tampilDataBuku();
        }
    }

    public int FindSeqsearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listBK.length; j++) {
            if (listBK[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    public void TampilkanData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku \t: " + x);
            System.out.println("Judul \t\t: " + listBK[pos].judulBuku);
            System.out.println("Tahun Terbit \t: " + listBK[pos].tahunTerbit);
            System.out.println("Pengarang \t: " + listBK[pos].Pengarang);
            System.out.println("Stock \t\t: " + listBK[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}
```

``` Class Mian Buku```
``` java
package P7;

import java.util.Scanner;

public class BukuMain26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        pencarianBuku26 data = new pencarianBuku26();
        int jumBuku = 5;

        System.out.println("===================================");
        System.out.println("Masukkan data Buku secara Urut dari Kodebuku terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("========================");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t:");
            int stock = s.nextInt();

            Buku26 m = new Buku26(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("===================================");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("===================================");
        System.out.println("Pencarian Data  ");
        System.out.println("Masukkan Kode Buku yang dicari  ");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential Search ");
        int posisi = data.FindSeqsearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilkanData(cari, posisi);
    }

}
```

### **6.2.2 Verifikasi Hasil Percobaan**
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/1222e441-f1a5-4cf6-b307-8778ec104364)

``` jika data ditemukan```<br>
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/718bbc3a-9922-4dcc-8c73-7e213d47acec)

``` jika data tidak ditemukan```<br>
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/bc730e92-1ae5-4011-8d4b-2e0eea58ec21)

### **6.2.3 Pertanyaan**
1. Jelaskan fungsi break yang ada pada method FindSeqSearch!<br>
Jawab : Fungsi break pada method tersebut untuk menghentikan perulangan for ketika elemen yang dicari telah ditemukan.<br>
2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?<br>
jawab : program masih bisa berjalan, dan dapat mencari data yang diinginkan menggunakan sequensial sort karena sorting tersebut dapat menacri data yang acak<br>
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/1ec5dab1-9029-4b26-910f-3a44a734b343)

3. Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe method dari FindBuku adalah BukuNoAbsen. Sehingga Anda bisa memanggil method tersebut pada class BukuMain seperti gambar berikut :<br>
jawab :
``` java
public Buku26 Findbuku(int cari) {
        int posisi = 0;
        for (int j = 0; j < listBK.length; j++) {
            if (listBK[j].kodeBuku == cari) {
                break;
            }
        }
        return listBK[posisi];
    }
```
``` java
Buku26 dataBuku26 = data.Findbuku(cari);
        dataBuku26.tampilDataBuku();
```

## **6.3. Searching / Pencarian Menggunakan Binary Search**
### **6.3.1. Langkah-langkah Percobaan Binary Search**

``` Method Binary Search```

``` java
public int FindBinarySearch(int cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (listBK[mid].kodeBuku == cari) {
                return mid;
            }
            if (listBK[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            }
            return FindBinarySearch(cari, mid + 1, right);
        }
        return -1;
    }
```
``` Memanggil method binary search pada Main```
``` java
        System.out.println("===================================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilkanData(cari, posisi);
```
### **6.3.2 Verifikasi Hasil Percobaan**
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/3d2ff148-7e74-45fe-8fdd-39b1bb57f918)

### **6.3.3 Pertanyaan**
1. Tunjukkan pada kode program yang mana proses divide dijalankan!<br>
jawab : terjadi proses divide untuk membagi rentang pencarian menjadi dua bagian<br>
``` java
        if (right >= left) {
            int mid = left + (right - left) / 2;
```
2. Tunjukkan pada kode program yang mana proses conquer dijalankan!<br>
jawab : conqueror terjadi saat pengecekan apakah nilai tengah sesuai dengan nilai yang dicari
``` java
if (listBK[mid].kodeBuku == cari)
```
3. Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan mengapa hal tersebut bisa terjadi?<br>
jawab : program tetap bisa berjalan namun hasilnya tidak akurat, karena binary t search idak dapat mendapat membagi data dengan benar apabila datanya acak.<br>
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/824f86cb-6ecb-454f-870a-2dc6972df850)

5. Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214, 20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai!<br>
jawab : hasilnya tidak ditemukan karena binary search mengasusmsikan elemen array terurut secara meningkat,
``` java
 public int findBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari == listBK[mid].kodeBuku) {
                return mid;
            } else if (listBK[mid].kodeBuku < cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
```
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/4fa20428-ad07-4bc4-b605-af69e7ecb69d)


## **6.4. Percobaan Pengayaan Divide and Conquer**
### **6.4.1. Langkah-langkah Percobaan Merge Sort**

``` Class Merge Sorting```
``` java
package P5;

public class MergeSorting26 {
    public void mergeSort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    public void merge(int data[], int left, int middle, int right) {
        int[] temp = new int[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            data[c + i] = temp[a + i];
        }
    }

    public void sort(int data[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
```
``` Class main merge sorting```
``` java
package P5;

public class MergeSortMain26 {
    public static void main(String[] args) {
        MergeSorting26 mergeSort = new MergeSorting26();

        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };
        System.out.println("Sorting dengan merge sort");
        System.out.println("Data Awal");
        mergeSort.printArray(data);
        mergeSort.mergeSort(data);
        System.out.println("Setelah Diurutkan");
        mergeSort.printArray(data);

    }
}
```
### **6.4.2 Verifikasi Hasil Percobaan**
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/6ba23ed5-dea4-47e7-a82f-5c3a384da345)


# **Latihan Pratikum**
1. Modifikasi percobaan searching diatas dengan ketentuan berikut ini
- Ubah tipe data dari kode Buku yang awalnya int menjadi String
``` java
public class Buku26 {
    String kodeBuku;//ubah string
    String judulBuku;
    int tahunTerbit;
    String Pengarang;
    int stock;

    public Buku26(String kodeBuku, String judulBuku, int tahunTerbit, String Pengarang, int stock) {//ubah string
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.Pengarang = Pengarang;
        this.stock = stock;
    }
//
- Tambahkan method untuk pencarian kode Buku (bertipe data String) dengan menggunakan
``` java

sequential search dan binary search.
2. Modifikasi percobaan searching diatas dengan ketentuan berikut ini
  - Tambahkan method pencarian judul buku menggunakan sequential search dan binary
search. Sebelum dilakukan searching dengan binary search data harus dilakukan pengurutan
dengan menggunakan algoritma Sorting (bebas pilih algoritma sorting apapun)! Sehingga
ketika input data acak, maka algoritma searching akan tetap berjalan
- Buat aturan untuk mendeteksi hasil pencarian judul buku yang lebih dari 1 hasil dalam
bentuk kalimat peringatan! Pastikan algoritma yang diterapkan sesuai dengan kasus yang
diberikan!
