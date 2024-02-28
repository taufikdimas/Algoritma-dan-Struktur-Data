# <p align="center">JOBSHEET III - ARRAY OF OBJEK</p>

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

## **3.2 Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan**
### **3.2.1 Langkah-langkah Percobaan**
```java
public class PersegiPanjang_26 {
    public int panjang;
    public int lebar;
}
```
```java
public class ArrayObjects_26 {
    public static void main(String[] args) {
        PersegiPanjang_26[] ppArray = new PersegiPanjang_26[3];

        ppArray[0] = new PersegiPanjang_26();
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30;

        ppArray[1] = new PersegiPanjang_26();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;

        ppArray[2] = new PersegiPanjang_26();
        ppArray[2].panjang = 100;
        ppArray[2].lebar = 20;

        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        System.out.println("Persegi Panjang ke-1, panjang: " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
        System.out.println("Persegi Panjang ke-2, panjang: " + ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);
    }
}
```
### **3.2.2 Verifikasi Hasil Percobaan**
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/560841d9-510f-406f-9d6b-593b3b527a48)

### **3.2.3 Pertanyaan**
```1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method?Jelaskan!```<br>
** Jawaban : **
 Tidak harus, adanya atribut dan method bergantung pada kebutuhan program  <br>
```2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut :```
``` java
ppArray[1] = new PersegiPanjang_26();
```
** Jawaban **
Ya, Pemanggilan baris tersebut akan memanggil konstruktor default dari class PersegiPanjang_26 <br>

```3. Apa yang dimaksud dengan kode berikut ini:```
``` java
PersegiPanjang_26[] ppArray = new PersegiPanjang_26[3];
```

```4. Apa yang dimaksud dengan kode berikut ini:```<br>
```java
 ppArray[1] = new PersegiPanjang_26();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;
```

## **3.3 Percobaan 2: Menerima Input Isian Array Menggunakan Looping**
### **3.3.1 Langkah-langkah Percobaan**
``` java
import java.util.Scanner;

public class ArrayObjects_26 {
    public static void main(String[] args) {
        PersegiPanjang_26[] ppArray = new PersegiPanjang_26[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang_26();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }
    }
}
```
### **3.3.2 Verifikasi Hasil Percobaan**
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/60875076-4ac5-4d1f-9fa9-058726754157)


### **3.3.3 Pertanyaan**

```1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?```

```2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!```

```3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode dibawah ini akan memunculkan error saat dijalankan. Mengapa?```

``` java
Persegi[] pgArray = new Persegi[100];
phArray[5].sisi = 20;
 ```

```4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!```

```5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan pada ppArray[i] sekaligus ppArray[0]?Jelaskan !```

## **3.4 Percobaan 3: Penambahan Operasi Matematika di Dalam Method**
### **3.4.1 Langkah-langkah Percobaan**
``` java
package ArrayBalok;

public class ArrayBalok {

    public static void main(String[] args) {
        Balok_26 blArray[] = new Balok_26[3];

        blArray[0] = new Balok_26(100, 30, 12);
        blArray[1] = new Balok_26(120, 40, 15);
        blArray[2] = new Balok_26(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume Balok ke " + i + ": " + blArray[i].hitungVolume());
        }
    }

}
```
``` java
package ArrayBalok;

public class Balok_26 {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok_26(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }
}
```
### **3.4.2 Verifikasi Hasil Percobaan**
![image](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/326c6120-88d5-4826-8a56-b6fdf23b0f13)


### **3.4.3 Pertanyaan**

```1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!```
```2. Jika diketahui terdapat class Segitiga seperti berikut ini:Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi. ```
``` java
public class Segitiga{
    public int alas;
    public int tinggi;
}
```
```3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan library Math pada Java untuk mengkalkulasi sisi miring) ```<br>
```4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing atributnya sebagai berikut:```<br>
```sgArray ke-0 alas: 10, tinggi: 4 ```<br>
```sgArray ke-1 alas: 20, tinggi: 10```<br>
```sgArray ke-2 alas: 15, tinggi: 6```<br>
```sgArray ke-3 alas: 25, tinggi: 10```<br>
```5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method hitungLuas() dan hitungKeliling().```<br>

## **3.5 Latihan Praktikum**
### **1. Buatlah program yang dapat menghitung luas permukaan dan volume bangun ruang kerucut, limas segi empat sama sisi, dan bola**
```class Kerucut```
``` java 
package BangunRuang;

public class Kerucut_26 {
    public double jariJari;
    public double sisiMiring;

    public Kerucut_26(double jariJari, double sisiMiring) {
        this.jariJari = jariJari;
        this.sisiMiring = sisiMiring;
    }

    public double LuasPermukaan() {
        return Math.PI * jariJari * (jariJari + sisiMiring);
    }

    public double Volume() {
        return (Math.PI * jariJari * jariJari * sisiMiring) / 3;
    }
}
```
```class limas Segi Empat Sama Sisi```
``` java 
package BangunRuang;

public class limasSegiEmpat_26 {
    double panjangSisiAlas;
    double tinggiLimas;

    public limasSegiEmpat_26(double panjangSisiAlas, double tinggiLimas) {
        this.panjangSisiAlas = panjangSisiAlas;
        this.tinggiLimas = tinggiLimas;
    }

    double hitungLuasPermukaan() {
        return panjangSisiAlas * panjangSisiAlas + 4 * (0.5 * panjangSisiAlas * tinggiLimas);
    }

    double hitungVolume() {
        return (panjangSisiAlas * panjangSisiAlas * tinggiLimas) / 3;
    }
}
```
```class Bola```
``` java
package BangunRuang;

public class Bola_26 {
    double jariJariB;

    public Bola_26(double jariJari) {
        this.jariJariB = jariJari;
    }

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJariB, 2);
    }

    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJariB, 3);
    }

}
```
```main Bangun Ruang```
``` java
package BangunRuang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Kerucut
        System.out.print("Masukkan jari-jari kerucut: ");
        double jariJari = sc.nextDouble();
        System.out.print("Masukkan sisi miring kerucut: ");
        double sisiMiring = sc.nextDouble();

        Kerucut_26 kerucut = new Kerucut_26(jariJari, sisiMiring);

        // Input Limas Segi Empat
        System.out.print("Masukkan panjang sisi alas limas segi empat: ");
        double panjangSisiAlas = sc.nextDouble();
        System.out.print("Masukkan tinggi limas segi empat: ");
        double tinggiLimas = sc.nextDouble();

        limasSegiEmpat_26 limas = new limasSegiEmpat_26(panjangSisiAlas, tinggiLimas);

        // Input Bola
        System.out.print("Masukkan jari-jari bola: ");
        double jariJariB = sc.nextDouble();

        Bola_26 bola = new Bola_26(jariJariB);

        //hasil perhitungan
        System.out.println("Luas Permukaan dan Volume Kerucut:");
        System.out.println("Luas Permukaan: " + Math.round(kerucut.LuasPermukaan()));
        System.out.println("Volume: " + Math.round(kerucut.Volume()));

        System.out.println("\nLuas Permukaan dan Volume Limas Segi Empat:");
        System.out.println("Luas Permukaan: " + Math.round(limas.hitungLuasPermukaan()));
        System.out.println("Volume: " + Math.round(limas.hitungVolume()));

        System.out.println("\nLuas Permukaan dan Volume Bola:");
        System.out.println("Luas Permukaan: " + Math.round(bola.hitungLuasPermukaan()));
        System.out.println("Volume: " + Math.round(bola.hitungVolume()));

        sc.close();
    }
}
```
### ** Verifikasi Hasil Percobaan**
![image-2](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/c0c28a84-9496-4730-8cf4-a01742d04017)


### **2. program untuk menampilkan informasi mahasiswa berupa nama, nim, jenis kelamin dan juga IPK mahasiswa**
```Kode Program ```
``` java
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
```

### ** Verifikasi Hasil Percobaan**
![image-3](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/72182c24-302f-49ac-974e-c60128ec214f)


### **2. program untuk menampilkan informasi mahasiswa berupa nama, nim, jenis kelamin dan juga IPK mahasiswa**
``` java
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
```
### ** Verifikasi Hasil Percobaan**
![image-4](https://github.com/taufikdimas/Algoritma-dan-Struktur-Data/assets/143729231/a876c410-c574-4b9a-a886-3e5779188efe)
