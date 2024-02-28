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

```2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut :```
``` java
ppArray[1] = new PersegiPanjang_26();
```

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
![alt text](image.png)

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
![alt text](image-1.png)

### **3.4.3 Pertanyaan**

```1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!```
```2. Jika diketahui terdapat class Segitiga seperti berikut ini:, Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi. ```
``` java
public class Segitiga{
    public int alas;
    public int tinggi;
}
```
```3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan library Math pada Java untuk mengkalkulasi sisi miring) ```
```4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing atributnya sebagai berikut:```
```sgArray ke-0 alas: 10, tinggi: 4 ```
```sgArray ke-1 alas: 20, tinggi: 10```
```sgArray ke-2 alas: 15, tinggi: 6```
```sgArray ke-3 alas: 25, tinggi: 10```
```5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method hitungLuas() dan hitungKeliling().```

## **3.5 Latihan Praktikum**