# <p align="center">JOBSHEET VII - Stack</p>

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

## **7.1 Percobaan 1: Penyimpanan Tumpukan Barang dalam Gudang**
### **7.1.1. Langkah-langkah Percobaan**
``` Class Barang```
``` java
package Stack;

public class Barang26 {
    // atribut
    int kode;
    String nama, kategori;

    // konstruktor berparameter
    public Barang26(int kode, String nama, String kategori) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
    }
}
```
``` Class Gudang```
``` java
package Stack;

public class Gudang26 {
    Barang26[] tumpukan;
    int size, top;

    public Gudang26(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang26[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang26 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gudang");
        } else {
            System.out.println("GAGAL!!! , Tumpukan barang digudang sudah penuh");
        }
    }

    public Barang26 ambilBarang() {
        if (!cekKosong()) {
            Barang26 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " berhasil diambil dari Gudang");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang digudang");
            for (int i = top; i >= 0; i--) {
                // for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }
}
```
``` Class Utama```
``` java
package Stack;

import java.util.Scanner;

public class Utama26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        Gudang26 gudang = new Gudang26(7);

        while (true) {
            System.out.println("\nMenu :");
            System.out.println("1. Tambahkan Barang ke Gudang");
            System.out.println("2. Ambil Barang dari Gudang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Keluar");
            System.out.print("Masukkan Pilihan : ");
            int pilihan = sc26.nextInt();
            sc26.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Barang: ");
                    int kode = sc26.nextInt();
                    sc26.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String nama = sc26.nextLine();
                    System.out.print("Masukkan Kategori : ");
                    String kategori = sc26.nextLine();
                    Barang26 barangBaru = new Barang26(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak valid, Silahkan coba lagi");
            }
        }
    }
}
```
### **7.1.2 Verifikasi Hasil Percobaan**
``` java
Menu :
1. Tambahkan Barang ke Gudang
2. Ambil Barang dari Gudang
3. Tampilkan Tumpukan Barang
4. Keluar
Masukkan Pilihan : 1
Masukkan Kode Barang: 21
Masukkan Nama : Majalah
Masukkan Kategori : Buku
Barang Majalah berhasil ditambahkan ke gudang

Menu :
1. Tambahkan Barang ke Gudang
2. Ambil Barang dari Gudang
3. Tampilkan Tumpukan Barang
4. Keluar
Masukkan Pilihan : 1
Masukkan Kode Barang: 26
Masukkan Nama : Jaket
Masukkan Kategori : Pakaian
Barang Jaket berhasil ditambahkan ke gudang

Menu :
1. Tambahkan Barang ke Gudang
2. Ambil Barang dari Gudang
3. Tampilkan Tumpukan Barang
4. Keluar
Masukkan Pilihan : 2
Barang Jaket berhasil diambil dari Gudang

Menu :
1. Tambahkan Barang ke Gudang
2. Ambil Barang dari Gudang
3. Tampilkan Tumpukan Barang
4. Keluar
Masukkan Pilihan : 1 
Masukkan Kode Barang: 33
Masukkan Nama : Pizza
Masukkan Kategori : Makanan
Barang Pizza berhasil ditambahkan ke gudang

Menu :
1. Tambahkan Barang ke Gudang
2. Ambil Barang dari Gudang
3. Tampilkan Tumpukan Barang
4. Keluar
Masukkan Pilihan : 3
Rincian tumpukan barang digudang
Kode 21: Majalah (Kategori Buku)
Kode 33: Pizza (Kategori Makanan)
```
### **7.1.3 Pertanyaan**
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana saja yang perlu diperbaiki?<br>
Jawab : Bagian yang diubah adalah pada method tampilBarang bagian iterasinya ```  for (int i = top; i >= 0; i--)``` sehingga iterasi dilakukan dari indeks teratas ke indeks terbawah.<br>
``` java
Menu :
1. Tambahkan Barang ke Gudang
2. Ambil Barang dari Gudang
3. Tampilkan Tumpukan Barang
4. Keluar
Masukkan Pilihan : 1
Masukkan Kode Barang: 21
Masukkan Nama : Majalah
Masukkan Kategori : Buku
Barang Majalah berhasil ditambahkan ke gudang

Menu :
1. Tambahkan Barang ke Gudang
2. Ambil Barang dari Gudang
3. Tampilkan Tumpukan Barang
4. Keluar
Masukkan Pilihan : 1
Masukkan Kode Barang: 33
Masukkan Nama : Pizza
Masukkan Kategori : makanan
Barang Pizza berhasil ditambahkan ke gudang

Menu :
1. Tambahkan Barang ke Gudang
2. Ambil Barang dari Gudang
3. Tampilkan Tumpukan Barang
4. Keluar
Masukkan Pilihan : 3
Rincian tumpukan barang digudang
Kode 33: Pizza (Kategori makanan)
Kode 21: Majalah (Kategori Buku)
```
2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode programnya!<br>
jawab : 7 , ``` Gudang26 gudang = new Gudang26(7);```<br>
3. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi tersebut dihapus, apa dampaknya?<br>
jawab :  Pengecekan kondisi `!cekKosong()` pada method `tampilkanBarang()` dilakukan untuk memastikan bahwa hanya akan mencoba untuk menampilkan barang jika tumpukan tidak kosong. Jika kondisi tersebut dihapus, program akan mencoba untuk melakukan iterasi terhadap array tumpukan yang kosong, yang dapat menyebabkan error atau output yang tidak diinginkan.<br>
4. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat barang teratas, serta dapat secara bebas menentukan kapasitas gudang!<br>
jawab :<br>
``` modifikasi program```
``` java
int kapasitasGudang = sc26.nextInt();//kapasistas gudang sesuai input
//melihat barang teratas
case 4:
                    if (!gudang.cekKosong()) {
                        System.out.println("Barang teratas: " + gudang.tumpukan[gudang.top].nama);
                    } else {
                        System.out.println("Tumpukan barang kosong");
                    }
                    break;
```
``` Verifiksi hasil Modifikasi```
``` java
Masukkan kapasitas gudang: 2

Menu :
1. Tambahkan Barang ke Gudang
2. Ambil Barang dari Gudang
3. Tampilkan Tumpukan Barang
4. Lihat Barang Teratas
5. Keluar
Masukkan Pilihan : 1
Masukkan Kode Barang: 26
Masukkan Nama : Laptop
Masukkan Kategori : Elektronik
Barang Laptop berhasil ditambahkan ke gudang

Menu :
1. Tambahkan Barang ke Gudang
2. Ambil Barang dari Gudang
3. Tampilkan Tumpukan Barang
4. Lihat Barang Teratas
5. Keluar
Masukkan Pilihan : 1
Masukkan Kode Barang: 48 
Masukkan Nama : HP
Masukkan Kategori : Elektronik
Barang HP berhasil ditambahkan ke gudang

Menu :
1. Tambahkan Barang ke Gudang
2. Ambil Barang dari Gudang
3. Tampilkan Tumpukan Barang
4. Lihat Barang Teratas
5. Keluar
Masukkan Pilihan : 1
Masukkan Kode Barang: 34 
Masukkan Nama : TWS
Masukkan Kategori : Elektronik
GAGAL!!! , Tumpukan barang digudang sudah penuh

Menu :
1. Tambahkan Barang ke Gudang
2. Ambil Barang dari Gudang
3. Tampilkan Tumpukan Barang
4. Lihat Barang Teratas
5. Keluar
Masukkan Pilihan : 4
Barang teratas: HP
```

## **7.2. Percobaan 2: Konversi Kode Barang ke Biner**
### **7.2.1. Langkah-langkah Percobaan Binary Search**
