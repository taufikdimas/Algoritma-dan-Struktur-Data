# <p align="center">JOBSHEET IV - Brute Force dan Divide Conquer</p>

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

## **4.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer**
### **4.2.1 Langkah-langkah Percobaan**

``` Class Faktorial```
``` java
package minggu5;

public class Faktorial_26 {

    public int nilai;

    int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;// i bukan 1
        }
        return fakto;
    }

    int faktorialDC(int n) {
        if (n == 0 || n == 1) {// perbaikan
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}
```

``` Main Faktorial```
``` java
package minggu5;

import java.util.Scanner;

public class mainFaktorial_26 {

    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.println("----------------");
        System.out.print("Masukkan jumlah elemen : ");
        int iJml = sc26.nextInt();

        Faktorial_26[] fk = new Faktorial_26[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial_26();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + ":");
            int iNilai = sc26.nextInt();
            fk[i].nilai = iNilai;// perbaikan : mengatur nilai anggota variabel
        }

        System.out.println("Hasil-Brute Force");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan Brute Force adalah = " + fk[i].faktorialBF(fk[i].nilai));

        }
        System.out.println("Hasil-Divide Conqueror");
        for (int i = 0; i < iJml; i++) {
            System.out
                    .println(
                            "Hasil Perhitungan Menggunakan Divide and Queror adlah = "
                                    + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
```
### **4.2.2 Verifikasi Hasil Percobaan**

### **4.2.3 Pertanyaan**

1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan
perbedaan bagian kode pada penggunaan if dan else!
```perbedaan antara keduanya berada pada kondisi dan hasil yang dikembalikan. Kode if digunakan untuk memeriksa apakah nilai n sama dengan 0 atau 1, sedangkan kode else memastikan jika n tidak sama dengan 0 atau 1```
3. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan
for?Buktikan!
```selain menggunakan for perulangan pada method faktorialBF() dapat menggunakan perulangan while ```
``` java
int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto = fakto * i;
            i++;
        }
        return fakto;
    }
```
5. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
```fakto *= i; digunakan untuk menghitung nilai faktorial dengan menggunakan perulangan, sedangkan int fakto = n * faktorialDC(n-1); digunakan untuk menghitung faktorial menggunakan rekursi```

### **4.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer**
### **4.3.1 Langkah-langkah Percobaan**
``` Class Pangkat```
``` java
package minggu5;

public class Pangkat_26 {
    public int nilai, pangkat;

    int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) {

                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            } else {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
            }
        }

    }
}
```
```Main Pangkat```
``` java
package minggu5;

import java.util.Scanner;

public class mainPangkat_26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.println("=====================");
        System.out.print("Masukkan jumlah elemen yang di hitung : ");
        int elemen = sc26.nextInt();

        Pangkat_26[] png = new Pangkat_26[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat_26();
            System.out.print("Masukkan nilai yang hendak dipangkatkan : ");
            png[i].nilai = sc26.nextInt();
            System.out.print("Masukkan nilai pangkat : ");
            png[i].pangkat = sc26.nextInt();
        }

        System.out.println("Hasil Pangkat - Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println(" Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("Hasil Pangkat - Divide Conqueror");
        for (int i = 0; i < elemen; i++) {
            System.out.println(" Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }

    }
}
```

### **4.3.2 Verifikasi Hasil Percobaan**

### **4.3.3 Pertanyaan**
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan
konstruktor.
4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan
switch-case!


## **4.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer**
### **4.4.1 Langkah-langkah Percobaan**

```Class Sum```
``` java
package minggu5;

public class Sum_26 {
    int elemen;
    double keuntungan[], total;

    Sum_26(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum;
        }
        return 0;
    }
}
```

```Main Sum```
``` java
package minggu5;

import java.util.Scanner;

public class mainSum_26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta ex:5.9)");
        System.out.print("Masukkan jumlah Bulan : ");
        int elm = sc26.nextInt();

        Sum_26 sm = new Sum_26(elm);
        System.out.println("============================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke - " + (i + 1) + " = ");
            sm.keuntungan[i] = sc26.nextDouble();
        }

        System.out.println("================================");
        System.out.println("Algoritma Brute Force");
        System.out.println(
                "Total keuntungan perusahaan selama " + sm.elemen + "bulan adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("================================");
        System.out.println("Algoritme Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + "bulan adalah = "
                + sm.totalDC(sm.keuntungan, 0, sm.elemen));

    }
}
```

### **4.4.2 Verifikasi Hasil Percobaan**

### **4.4.3 Pertanyaan**
1. Mengapa terdapat formulasi return value berikut?Jelaskan!
2. Kenapa dibutuhkan variable mid pada method TotalDC()?
3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja.
Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa
perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan
dengan program!

## **4.5 Latihan Pratikum**
a) top_acceleration tertinggi menggunakan Divide and Conquer! <br>
b) top_acceleration terendah menggunakan Divide and Conquer! <br>
c) Rata-rata top_power dari seluruh mobil menggunakan Brute Force! <br>


































