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
`Class Barang.26`
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
``` Class Gudang26```
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
``` Class Utama26```
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
### **7.2.1. Langkah-langkah Percobaan **
`Class StackKonversi26`
``` java
package Stack;

public class StackKonversi26 {
    int size;
    int[] tumpukanBiner;
    int top;

    public StackKonversi26() {
        this.size = 32;// asumsi 32 bit
        this.tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
```
`class Gudang26`
``` java
 public String konversiDesimalkeBiner(int kode) {

        StackKonversi26 stack = new StackKonversi26();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner = biner + stack.pop();
        }
        return biner;
    }
```

### **7.2.2 Verifikasi Hasil Percobaan**
``` java
Masukkan kapasitas gudang: 1

Menu :
1. Tambahkan Barang ke Gudang
2. Ambil Barang dari Gudang
3. Tampilkan Tumpukan Barang
4. Lihat Barang Teratas
5. Keluar
Masukkan Pilihan : 1
Masukkan Kode Barang: 13
Masukkan Nama : Setrika
Masukkan Kategori : Elektronik
Barang Setrika berhasil ditambahkan ke gudang

Menu :
1. Tambahkan Barang ke Gudang
2. Ambil Barang dari Gudang
3. Tampilkan Tumpukan Barang
4. Lihat Barang Teratas
5. Keluar
Masukkan Pilihan : 2
Barang Setrika berhasil diambil dari Gudang
Kode unik dalam biner : 1101
```
### **7.2.3 Pertanyaan**
1. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya!<br>
jawab : Mengubah kondisi perulangan menjadi while (kode != 0) tidak akan mengubah hasilnya karena pada dasarnya itu akan menghasilkan hasil yang sama dengan kondisi while (kode > 0). Hal ini karena perulangan akan berhenti ketika kode mencapai nilai 0 setelah dibagi secara berulang dengan 2.<br>
2. Jelaskan alur kerja dari method konversiDesimalKeBiner!<br>
jawab : Pertama-tama membuat sebuah objek `StackKonversi26` untuk menyimpan sisa hasil pembagian dari operasi pembagian desimal ke biner. Selanjutnya, selama nilai `kode` masih lebih besar dari 0, langkah-langkah berikut dilakukan: menghitung sisa hasil bagi `kode` dengan 2, menambahkan sisa tersebut ke dalam stack, dan kemudian membagi `kode` dengan 2 untuk mendapatkan digit berikutnya dalam representasi biner. Setelah semua digit biner telah ditambahkan ke dalam stack, program mengambil digit satu per satu dari stack dan menggabungkannya menjadi string biner. Akhirnya, string biner tersebut dikembalikan sebagai hasil konversi.

## **7.3 Percobaan 3: Konversi Notasi Infix ke Postfix**
### **7.3.1. Langkah-langkah Percobaan **
`class postfix26`
``` java
package Postfix;

public class Postfix26 {
    int n, top;
    char[] stack;

    public Postfix26(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    public void push(char c) {
        top++;
        stack[top] = c;
    }

    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    public boolean IsOperand(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c == ' ') || (c == '.')) {
            return true;
        }
        return false;

    }

    public boolean IsOperator(char c) {
        if (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+') {
            return true;
        }
        return false;
    }

    public int derajat(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String konversi(String Q) {
        String P = "";
        char c;
        for (int i = 0; i < n; i++) {
            c = Q.charAt(i);
            if (IsOperand(c)) {
                P = P + c;
            }
            if (c == '(') {
                push(c);
            }
            if (c == ')') {
                while (stack[top] != '(') {
                    P = P + pop();
                }
                pop();
            }
            if (IsOperator(c)) {
                while (derajat(stack[top]) >= derajat(c)) {
                    P = P + pop();
                }
                push(c);
            }
        }
        return P;
    }
}
```
`Class Postfix26`
``` java
package Postfix;

import java.util.Scanner;

public class PostfixMain26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        String P, Q;

        System.out.println("Masukkan ekspresi matematika (infix) : ");
        Q = sc26.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        Postfix26 post = new Postfix26(total);
        P = post.konversi(Q);
        System.out.println("Postfix : " + P);
    }
}
```
### **7.3.2 Verifikasi Hasil Percobaan**
``` java
Masukkan ekspresi matematika (infix) :
a+b*(c+d-e)/f
Postfix : abcd+e-*f/+
```
### **7.3.3 Pertanyaan**
1. Pada method derajat, mengapa return value beberapa case bernilai sama? Apabila return value diubah dengan nilai berbeda-beda setiap case-nya, apa yang terjadi?<br>
jawab : Method `derajat` mengembalikan nilai yang sama untuk beberapa case karena operator tersebut memiliki prioritas yang sama dalam ekspresi matematika. Jika nilai return diubah, prioritas operator akan berubah, mempengaruhi urutan operasi dalam ekspresi postfix.<br>
2. Jelaskan alur kerja method konversi!<br>
jawab : Metode konversi menginisialisasi variabel string `P` sebagai penyimpan ekspresi postfix. Setiap karakter dari ekspresi infix `Q` diproses secara berurutan. Jika karakter adalah operand, maka karakter tersebut ditambahkan ke string `P`. Tanda kurung buka dimasukkan ke dalam stack, sementara tanda kurung tutup mengeluarkan operator dari stack ke string `P`. Operator dimasukkan ke stack sesuai prioritasnya, dengan operator-operator yang lebih tinggi atau sama dikeluarkan dari stack sebelum operator baru dimasukkan. Proses ini berlangsung hingga semua karakter ekspresi diproses, dan akhirnya, string P yang berisi ekspresi postfix dikembalikan sebagai output.
3. Pada method konversi, apa fungsi dari potongan kode berikut?<br>
jawab :  Potongan kode `c = Q.charAt(i);` mengambil karakter dari ekspresi infix `Q` yang sedang diproses pada indeks ke-i dan menyimpannya dalam variabel `c` untuk penggunaan selanjutnya dalam konversi ke notasi postfix.

## **Latihan Pratikum**
### **Langkah-langkah Percobaan**
``` java
    public void lihatBarangTerbawah() {
        if (!cekKosong()) {
            System.out.println("Barang terbawah: " + tumpukan[0].nama);
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public void cariBarang(String keyword) {
        boolean found = false;
        if (!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                if (tumpukan[i].nama.equalsIgnoreCase(keyword) || tumpukan[i].kode == Integer.parseInt(keyword)) {
                    System.out.println("Barang ditemukan:");
                    System.out.printf("Kode: %d, Nama: %s, Kategori: %s\n", tumpukan[i].kode, tumpukan[i].nama,
                            tumpukan[i].kategori);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Barang tidak ditemukan");
        }
    }
```
### ** Verifikasi Percobaan**
``` java
Masukkan kapasitas gudang: 3

Menu :
1. Tambahkan Barang ke Gudang
2. Ambil Barang dari Gudang
3. Tampilkan Tumpukan Barang
4. Lihat Barang Teratas
5. Lihat Barang Terbawah
6. Cari Barang
7. Keluar
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
5. Lihat Barang Terbawah
6. Cari Barang
7. Keluar
Masukkan Pilihan : 1
Masukkan Kode Barang: 29
Masukkan Nama : HP
Masukkan Kategori : Elektronik
Barang HP berhasil ditambahkan ke gudang

Menu :
1. Tambahkan Barang ke Gudang
2. Ambil Barang dari Gudang
3. Tampilkan Tumpukan Barang
4. Lihat Barang Teratas
5. Lihat Barang Terbawah
6. Cari Barang
7. Keluar
Masukkan Pilihan : 1
Masukkan Kode Barang: 22
Masukkan Nama : Kacamata
Masukkan Kategori : Aksesoris
Barang Kacamata berhasil ditambahkan ke gudang

Menu :
1. Tambahkan Barang ke Gudang
2. Ambil Barang dari Gudang
3. Tampilkan Tumpukan Barang
4. Lihat Barang Teratas
5. Lihat Barang Terbawah
6. Cari Barang
7. Keluar
Masukkan Pilihan : 5
Barang terbawah: Laptop

Menu :
1. Tambahkan Barang ke Gudang
2. Ambil Barang dari Gudang
3. Tampilkan Tumpukan Barang
4. Lihat Barang Teratas
5. Lihat Barang Terbawah
6. Cari Barang
7. Keluar
Masukkan Pilihan : 6
Masukkan kode atau nama barang yang ingin dicari: 26
Barang ditemukan:
Kode: 26, Nama: Laptop, Kategori: Elektronik
```
