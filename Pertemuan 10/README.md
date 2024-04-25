# <p align="center">JOBSHEET X - Queue</p>

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

## **10.2 Pratikum 1**
### **10.2.1. Langkah-langkah Percobaan**
``` Class Queue```
```java
package Pratikum1;

public class Queue26 {

    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue26(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen: " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue sudah dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int Dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

}
```

``` Class Queue Main```
```java
package Pratikum1;

import java.util.Scanner;

public class QueueMain26 {

    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas Queue : ");
        int n = sc26.nextInt();
        Queue26 Q = new Queue26(n);

        int pilih;
        do {
            menu();
            pilih = sc26.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = sc26.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
    }
}
```

### **10.2.2 Verifikasi hasil percobaan**

```java
Masukkan kapasitas Queue : 5
Masukkan operasi yang diinginkan :
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
1
Masukkan data baru : 26
Masukkan operasi yang diinginkan :
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
1
Masukkan data baru : 30
Masukkan operasi yang diinginkan :
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
4
Elemen terdepan: 26
Masukkan operasi yang diinginkan :
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
3
26
30
Jumlah elemen: 2
Masukkan operasi yang diinginkan :
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
```
### **10.2.3 Pertanyaan**

1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?<br>
Jawab : Nilai awal atribut front dan rear diatur sebagai -1 karena antrian kosong, sementara size diatur sebagai 0 antrian tidak memiliki elemen pada awalnya.<br>
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!<br>
Jawab : untuk mengatasi situasi di mana 'rear' sudah mencapai batas indeks maksimal (max - 1). Dengan mengatur 'rear' kembali ke indeks 0,memungkinkan antrian untuk berputar kembali ke awal array saat elemen terakhir terisi penuh.<br>
3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!<br>
jawab : untuk mengatur kembali posisi front ke indeks awal array jika sudah mencapai indeks maksimum (max - 1).<br> 
4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0),melainkan int i=front?<br>
Jawab : Perulangan dimulai dari front dalam metode print karena itu adalah elemen terdepan dalam queue pada saat itu. Dengan demikian, semua elemen queue dapat dijangkau dalam urutan yang benar bahkan jika queue telah berputar di sekitar akhir array<br>
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!<br>
Jawab : digunakan untuk memperbarui nilai indeks i dalam perulangan saat mencetak elemen queue,  Ekspresi (i + 1) % max menghasilkan nilai indeks baru yang selalu berada dalam rentang valid dari 0 hingga max - 1,Dengan menggunakan operasi modulus (%), jika i mencapai max - 1, nilai i akan kembali ke 0.<br>
6. Tunjukkan potongan kode program yang merupakan queue overflow!<br>
Jawab : <br>
```java
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
```
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!
Jawab : dengan menambahkan system.exit  untuk menghentikan program ketika kondisi tersebut
```java
public void Enqueue(int dt) {
    if (IsFull()) {
        System.out.println("Queue sudah penuh"); 
        System.exit(0);
```
```java
public int Dequeue() {
    int dt = 0;
    if (isEmpty()) {
        System.out.println("Queue masih kosong");
        System.exit(0);
```


## **10.3 Pratikum 2**
### **10.3.1. Langkah-langkah Percobaan**

``` Class Nasabah```
```java
package Pratikum2;

public class Nasabah26 {
    String nama, norek, alamat;
    int umur;
    double saldo;

    public Nasabah26() {

    }

    public Nasabah26(String nama, String norek, String alamat, int umur, double saldo) {
        this.nama = nama;
        this.norek = norek;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }

    public static class Queue26 {
        Nasabah26[] data;
        int front;
        int rear;
        int size;
        int max;

        public

        Queue26(int n) {
            max = n;
            data = new Nasabah26[max];
            size = 0;
            front = rear = -1;
        }

        public boolean isEmpty() {
            if (size == 0) {
                return true;
            } else {
                return false;
            }
        }

        public boolean IsFull() {
            if (size == max) {
                return true;
            } else {
                return false;
            }
        }

        public void peek() {
            if (!isEmpty()) {
                System.out.println("Elemen terdepan: " + data[front].norek + "" + data[front].nama + ""
                        + data[front].alamat + "" + data[front].umur + "" + data[front].saldo);
            } else {
                System.out.println("Queue masih kosong");
            }
        }

        public void print() {
            if (isEmpty()) {
                System.out.println("Queue masih kosong");
            } else {
                int i = front;
                while (i != rear) {
                    System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur
                            + " " + data[i].saldo);
                    i = (i + 1) % max;
                }
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " "
                        + data[i].saldo + " ");
                System.out.println("Jumlah elemen: " + size);
            }
        }

        public void clear() {
            if (!isEmpty()) {
                front = rear = -1;
                size = 0;
                System.out.println("Queue sudah dikosongkan");
            } else {
                System.out.println("Queue masih kosong");
            }
        }

        public void Enqueue(Nasabah26 dt) {
            if (IsFull()) {
                System.out.println("Queue sudah penuh");
                System.exit(0);
            } else {
                if (isEmpty()) {
                    front = rear = 0;
                } else {
                    if (rear == max - 1) {
                        rear = 0;
                    } else {
                        rear++;
                    }
                }
                data[rear] = dt;
                size++;
            }
        }

        public Nasabah26 Dequeue() {
            Nasabah26 dt = new Nasabah26();
            if (isEmpty()) {
                System.out.println("Queue masih kosong");
                System.exit(0);
            } else {
                dt = data[front];
                size--;
                if (isEmpty()) {
                    front = rear = -1;
                } else {
                    if (front == max - 1) {
                        front = 0;
                    } else {
                        front++;
                    }
                }
            }
            return dt;
        }
    }
}
```

```Java
package Pratikum2;

import java.util.Scanner;

import Pratikum2.Nasabah26.Queue26;

public class NasabahMain26 {
    public static void menu() {
        System.out.println("Pilih Menu :");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian ");
        System.out.println("=========================");
    }

    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas Queue : ");
        int jumlah = sc26.nextInt();
        Queue26 antri = new Queue26(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc26.nextInt();
            sc26.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening : ");
                    String norek = sc26.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc26.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = sc26.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc26.nextInt();
                    System.out.print("Saldo : ");
                    double saldo = sc26.nextDouble();
                    Nasabah26 nb = new Nasabah26(nama, norek, alamat, umur, saldo);
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah26 data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
                            && !"".equals(data.umur) && !"".equals(data.saldo)) {
                        System.out.println("Antrian yang keluar : " +
                                data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
```

### **10.3.2 Veifikasi hasil percobaan**
```java
Masukkan kapasitas Queue : 8
Pilih Menu :
1. Antrian Baru
2. Antrian keluar
3. Cek Antrian terdepan
4. Cek Semua Antrian
=========================
1
No Rekening : 12345
Nama : Dimas
Alamat : Malang
Umur : 23
Saldo : 10000000000
Pilih Menu :
1. Antrian Baru
2. Antrian keluar
3. Cek Antrian terdepan
4. Cek Semua Antrian
=========================
1
No Rekening : 32940
Nama : Vira
Alamat : Blitar
Umur : 39
Saldo : 2700000000
Pilih Menu :
1. Antrian Baru
2. Antrian keluar
3. Cek Antrian terdepan
4. Cek Semua Antrian
=========================
4
12345 Dimas Malang 23 1.0E10
32940 Vira Blitar 39 2.7E9
Jumlah elemen: 2
Pilih Menu :
1. Antrian Baru
2. Antrian keluar
3. Cek Antrian terdepan
4. Cek Semua Antrian
=========================
```
### ** 10.3.3 Pertanyaan**
1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!<br>
Jawab : If-statement tersebut digunakan untuk memeriksa apakah data yang diambil dari antrian memiliki nilai yang valid sebelum mencetaknya. Ini dilakukan dengan memeriksa apakah nomor rekening, nama, alamat, umur, dan saldo dari data tidak kosong. Jika semua kondisi terpenuhi, data tersebut akan dicetak.<br>
2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear dapat dipanggil!<br>
Jawab : 
```java
  public void peekRear() {
            if (!isEmpty()) {
                System.out.println("Elemen paling belakang: " + data[rear].norek + " " + data[rear].nama + " "
                        + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
            } else {
                System.out.println("Queue masih kosong");
            }
        }
```
```java
                case 5:
                    antri.peekRear();
                    break;
```
```java
Pilih Menu :
1. Antrian Baru
2. Antrian keluar
3. Cek Antrian terdepan
4. Cek Semua Antrian
5. Cek Antrian paling belakang
=========================
4
12345  Taufik Dimas  Blitar  19  1.0E7
87645  Vira Alfita  malang  17  200000.0
9567  Rio Rosario  Surabaya  24  3500000.0
Jumlah elemen: 3
Pilih Menu :
1. Antrian Baru
2. Antrian keluar
3. Cek Antrian terdepan
4. Cek Semua Antrian
5. Cek Antrian paling belakang
=========================
5
Elemen paling belakang: 9567 Rio Rosario Surabaya 24 3500000.0
```

## **10.4 Tugas**
### **10.4.1 Langkah-langkah percobaan**

``` Class Pembeli```
```java
package Tugas;

public class Pembeli26 {
    String nama;
    int noHP;

    public Pembeli26(String nama, int noHP) {
        this.nama = nama;
        this.noHP = noHP;
    }
}
```
```class Queue```
```java
package Tugas;

public class Queue26 {
    Pembeli26[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue26(int n) {
        max = n;
        antrian = new Pembeli26[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Pembeli26 antri) {
        if (!isFull()) {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            antrian[rear] = antri;
            size++;
        } else {
            System.out.println("Antrian penuh");
        }
    }

    public Pembeli26 dequeue() {
        Pembeli26 temp = null;
        if (!isEmpty()) {
            temp = antrian[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
            size--;
        } else {
            System.out.println("Antrian kosong");
        }
        return temp;
    }

    public void print() {
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                System.out.println("Nama: " + antrian[i].nama + ", No HP: " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println("Nama: " + antrian[i].nama + ", No HP: " + antrian[i].noHP);
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Pembeli paling depan: " + antrian[front].nama + ", No HP: " + antrian[front].noHP);
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Pembeli paling belakang: " + antrian[rear].nama + ", No HP: " + antrian[rear].noHP);
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peekPosition(String nama) {
        if (!isEmpty()) {
            int i = front;
            int position = 1;
            while (i != rear) {
                if (antrian[i].nama.equals(nama)) {
                    System.out.println("Pembeli " + nama + " berada di posisi antrian ke-" + position);
                    return;
                }
                position++;
                i = (i + 1) % max;
            }
            if (antrian[i].nama.equals(nama)) {
                System.out.println("Pembeli " + nama + " berada di posisi antrian ke-" + position);
            } else {
                System.out.println("Pembeli " + nama + " tidak ditemukan dalam antrian");
            }
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void daftarPembeli() {
        if (!isEmpty()) {
            System.out.println("Daftar Pembeli:");
            int i = front;
            while (i != rear) {
                System.out.println("Nama: " + antrian[i].nama + ", No HP: " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println("Nama: " + antrian[i].nama + ", No HP: " + antrian[i].noHP);
        } else {
            System.out.println("Antrian kosong");
        }
    }
}
```

```Class main```
```java
package Tugas;

import java.util.Scanner;

public class Main26 {
    public static void menu() {
        System.out.println("Pilih Menu :");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian paling Depan");
        System.out.println("4. Cek Posisi Paling Belakang");
        System.out.println("5. Cek Posisi Pembeli dalam Antrian");
        System.out.println("6. Daftar Semua Pembeli");
        System.out.println("7. Keluar");
        System.out.println("=========================");
    }

    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas Queue : ");
        int kapasitas = sc26.nextInt();
        Queue26 antrian = new Queue26(kapasitas);

        int pilih;
        do {
            menu();
            pilih = sc26.nextInt();
            sc26.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama Pembeli : ");
                    String nama = sc26.nextLine();
                    System.out.print("Masukkan Nomor HP Pembeli : ");
                    int noHP = sc26.nextInt();
                    Pembeli26 pembeliBaru = new Pembeli26(nama, noHP);
                    antrian.enqueue(pembeliBaru);
                    break;
                case 2:
                    Pembeli26 pembeliKeluar = antrian.dequeue();
                    if (pembeliKeluar != null) {
                        System.out.println("Pembeli " + pembeliKeluar.nama + " dengan Nomor HP " + pembeliKeluar.noHP
                                + " telah dikeluarkan dari antrian");
                    }
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    System.out.print("Masukkan Nama Pembeli yang ingin dicek posisinya : ");
                    String namaCek = sc26.nextLine();
                    antrian.peekPosition(namaCek);
                    break;
                case 6:
                    antrian.daftarPembeli();
                    break;
                case 7:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 7);
        sc26.close();
    }
}

```
### **Verifikasi Hasil Percobaan**

```java
Masukkan kapasitas Queue : 10
Pilih Menu :
1. Antrian Baru
2. Antrian keluar
3. Cek Antrian paling Depan
4. Cek Posisi Paling Belakang
5. Cek Posisi Pembeli dalam Antrian
6. Daftar Semua Pembeli
7. Keluar
=========================
1
Masukkan Nama Pembeli : dimas
Masukkan Nomor HP Pembeli : 123456
Pilih Menu :
1. Antrian Baru
2. Antrian keluar
3. Cek Antrian paling Depan
4. Cek Posisi Paling Belakang
5. Cek Posisi Pembeli dalam Antrian
6. Daftar Semua Pembeli
7. Keluar
=========================
1
Masukkan Nama Pembeli : vira
Masukkan Nomor HP Pembeli : 654321
Pilih Menu :
1. Antrian Baru
2. Antrian keluar
3. Cek Antrian paling Depan
4. Cek Posisi Paling Belakang
5. Cek Posisi Pembeli dalam Antrian
6. Daftar Semua Pembeli
7. Keluar
=========================
1
Masukkan Nama Pembeli : rio     
Masukkan Nomor HP Pembeli : 09876363
Pilih Menu :
1. Antrian Baru
2. Antrian keluar
3. Cek Antrian paling Depan
4. Cek Posisi Paling Belakang
5. Cek Posisi Pembeli dalam Antrian
6. Daftar Semua Pembeli
7. Keluar
=========================
1
Masukkan Nama Pembeli : petrus
Masukkan Nomor HP Pembeli : 56545     
Pilih Menu :
1. Antrian Baru
2. Antrian keluar
3. Cek Antrian paling Depan
4. Cek Posisi Paling Belakang
5. Cek Posisi Pembeli dalam Antrian
6. Daftar Semua Pembeli
7. Keluar
=========================
3
Pembeli paling depan: dimas, No HP: 123456
Pilih Menu :
1. Antrian Baru
2. Antrian keluar
3. Cek Antrian paling Depan
4. Cek Posisi Paling Belakang
5. Cek Posisi Pembeli dalam Antrian
6. Daftar Semua Pembeli
7. Keluar
=========================
4
Pembeli paling belakang: petrus, No HP: 56545
Pilih Menu :
1. Antrian Baru
2. Antrian keluar
3. Cek Antrian paling Depan
4. Cek Posisi Paling Belakang
5. Cek Posisi Pembeli dalam Antrian
6. Daftar Semua Pembeli
7. Keluar
=========================
5
Masukkan Nama Pembeli yang ingin dicek posisinya : vira
Pembeli vira berada di posisi antrian ke-2
Pilih Menu :
1. Antrian Baru
2. Antrian keluar
3. Cek Antrian paling Depan
4. Cek Posisi Paling Belakang
5. Cek Posisi Pembeli dalam Antrian
6. Daftar Semua Pembeli
7. Keluar
=========================
6
Daftar Pembeli:
Nama: dimas, No HP: 123456
Nama: vira, No HP: 654321
Nama: rio, No HP: 9876363
Nama: petrus, No HP: 56545
```



