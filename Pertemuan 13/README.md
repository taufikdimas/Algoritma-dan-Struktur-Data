# <p align="center">JOBSHEET 10 - Double Linked List</p>

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

## **13.1 Kegiatan Pratikum 1**
### **13.1.1. Langkah-langkah Percobaan 1**

- Code `Node26.java`

```java
package doublelinketlist;

public class Node26 {
    int data;
    Node26 prev, next;

    Node26(Node26 prev, int data, Node26 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
```
- Code `DoubleLinkedList.java`

```java
package doublelinketlist;

public class DoubleLinkedList {
    Node26 head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node26(null, item, null);
        } else {
            Node26 newNode = new Node26(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node26 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node26 newnNode = new Node26(current, item, null);
            current.next = newnNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node26 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node26 newNode = new Node26(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node26 newNode = new Node26(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node26 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil Diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

}
```
- Code `DoubleLinkedListMain.java`
```java
package doublelinketlist;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=======================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=======================================");
        try {
            dll.add(40, 1);
        } catch (Exception e) {
            System.err.println("Pesan Error : " + e.getMessage());
        }
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=======================================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=======================================");

    }
}
```
### **13.1.2. Verifikasi Percobaan**
```java
Linked List Kosong
Size : 0
=======================================
7       3       4
Berhasil Diisi
Size : 3
=======================================
7       40      3       4
Berhasil Diisi
Size : 4
=======================================
Linked List Kosong
Size : 0
=======================================
PS D:\Github\Algoritma-dan-Struktur-Data>
```
### **13.1.3. Pertanyaan**
1. Jelaskan perbedaan antara single linked list dengan double linked lists ! <br>
`Jawab :` Single linked list memiliki node dengan satu pointer yang menunjuk ke node berikutnya, memungkinkan traversal satu arah dan efisien dalam penggunaan memori, tetapi kurang fleksibel untuk operasi bolak-balik. Sebaliknya, double linked list memiliki dua pointer per node, yang menunjuk ke node berikutnya dan sebelumnya, memungkinkan traversal dua arah dan memudahkan operasi penyisipan dan penghapusan.<br>
2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut ?<br>
`Jawab :` atribut next dan prev berfungsi sebagai navigasi dan manipulasi data yang efisien dalam double linked list yang memberikan fleksibilitas dan memungkinkan traversal dalam arah maju maupun mundur.<br>
3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada gambar berikut ini ?<br>
`Jawab :` inisialisasi head dan size dalam konstruktor memastikan linked list dimulai dalam keadaan yang benar dan siap untuk operasi selanjutnya.<br>
4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null?<br>
`Jawab :` Mengatur prev ke null saat membuat node baru dalam method addFirst() berfungsi untuk memastikan bahwa newnode tersebut benar-benar menjadi node pertama dalam linked list.<br>
5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?<br>
`Jawab :` Ini menghubungkan node pertama yang lama (head saat ini) ke node baru sebagai node sebelumnya. Hal ini diperlukan agar linked list tetap konsisten dan memungkinkan navigasi mundur.<br>
6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null? Node newNode = new Node(current, item, null);<br>
`Jawab :` Ini membuat node baru dengan node terakhir saat ini sebagai prev dan null sebagai next, karena node baru ini akan menjadi node terakhir. Ini memungkinkan node baru untuk ditambahkan di akhir linked list dengan benar.<br>
7. Pada method add(), terdapat potongan kode program sebagai berikut<br>
`Jawab :` potongan kode tersebut berperan untuk membuat node baru dan menghubungkannya ke node pertama yang lama. memperbarui prev dari node pertama yang lama agar menunjuk ke node baru. mengatur head untuk menunjuk ke node baru ini, sehingga node baru menjadi node pertama dalam linked list.<br>

## **13.2 Kegiatan Pratikum 2**
### **13.2.1. Langkah-langkah Percobaan 2**

- Code `DoubleLinkedList.java`
```java
// Percobaan 2
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node26 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node26 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
        size--;
    }
```
- Code `DoubleLinkedListMain.java`
```java
 // Percobaan 2
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=======================================");
        try {
            dll.removeFirst();
        } catch (Exception e) {
            System.err.println("Pesan Error : " + e.getMessage());
        }
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=======================================");
        try {
            dll.removeLast();
        } catch (Exception e) {
            System.err.println("Pesan Error : " + e.getMessage());
        }
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=======================================");
        try {
            dll.remove(1);
        } catch (Exception e) {
            System.err.println("Pesan Error : " + e.getMessage());
        }
        dll.print();
        System.out.println("Size : " + dll.size());
```
### **13.2.2. Verifikasi Percobaan**
```java
50      40      10      20
Berhasil Diisi
Size : 4
=======================================
40      10      20
Berhasil Diisi
Size : 3
=======================================
40      10
Berhasil Diisi
Size : 2
=======================================
40
Berhasil Diisi
Size : 1
PS D:\Github\Algoritma-dan-Struktur-Data> 
```
### **13.2.3. Pertanyaan**
1. Apakah maksud statement berikut pada method removeFirst()?<br>
`Jawab :` head = head.next menggeser pointer head ke node berikutnya, menghapus node pertama dari linked list, sementara head.prev = null mengatur pointer prev dari node baru yang menjadi node pertama menjadi null, menunjukkan bahwa node tersebut tidak memiliki node sebelumnya.<br>
2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?<br>
`Jawab :` cek apakah linked list kosong atau hanya memiliki satu elemen. Jika iya, elemen tersebut dihapus dengan mengatur head menjadi null. Jika tidak, iterasi dilakukan hingga mencapai node kedua terakhir dengan mengecek current.next.next == null. Ketika mencapai posisi tersebut, pointer next dari node kedua terakhir diatur menjadi null.<br>
3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove<br>
`Jawab :` Karena tmp itu seharusnya pada node pertama dan merupakan head bukan head.next dan juga mengatur head.next ke tmp.next, maka itu akan melewati posisi node kedua dan langusung menghubungkan ke node pertama ke node setelahnya.<br> 
4. Jelaskan fungsi kode program berikut ini pada fungsi remove!<br>
`Jawab :` Baris pertama current.prev.next = current.next mengatur pointer next dari node sebelumnya untuk menunjuk ke node setelah current, menghapus current dari linked list. Sedangkan baris kedua current.next.prev = current.prev mengatur pointer prev dari node setelah current untuk menunjuk ke node sebelum current.<br>

## **13.3 Kegiatan Pratikum 2**
### **13.3.1. Langkah-langkah Percobaan 2**
- Code `DoubleLinkedList.java`
```java
// Percobaan 3

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node26 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node26 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
```
- Code `DoubleLinkedListMain.java`
```java
// Percobaan 3
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=======================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=======================================");
        try {
            dll.add(40, 1);
        } catch (Exception e) {
            System.err.println("Pesan Error : " + e.getMessage());
        }
        dll.print();
        System.out.println("Size : " + dll.size());
        try {
            System.out.println("=======================================");
            try {
                System.out.println("Data awal pada Linked List adalah : " + dll.getFirst());
            } catch (Exception e) {
                System.out.println("Data awal pada Linked List adalah : List is empty");
            }

            try {
                System.out.println("Data akhir pada Linked List adalah : " + dll.getLast());
            } catch (Exception e) {
                System.out.println("Data akhir pada Linked List adalah : List is empty");
            }

            try {
                System.out.println("Data indeks ke-1 pada Linked List adalah : " + dll.get(1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Data indeks ke-1 pada Linked List adalah : Index out of range");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
```

### **13.3.2. Verifikasi Percobaan**\
```java
Linked List Kosong
Size : 0
=======================================
7       3       4
Berhasil Diisi
Size : 3
=======================================
7       40      3       4
Berhasil Diisi
Size : 4
=======================================
Data awal pada Linked List adalah : 7
Data akhir pada Linked List adalah : 4
Data indeks ke-1 pada Linked List adalah : 40
PS D:\Github\Algoritma-dan-Struktur-Data> 
```
### **13.3.3. Pertanyaan**
1. Jelaskan method size() pada class DoubleLinkedLists!<br>
`Jawab : ` Method size() pada kelas DoubleLinkedList digunakan untuk mengembalikan jumlah elemen yang saat ini ada dalam linked list. Ini dilakukan dengan mengakses variabel size yang menyimpan jumlah elemen yang tercatat dalam linked list dan mengembalikannya sebagai hasil.<br> 
2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke1!<br>
`Jawab : ` dengan menetapkan head untuk menunjuk ke elemen tersebut. Hal ini memungkinkan untuk mengakses, menambah, dan menghapus elemen dengan menggunakan indeks 1 tanpa memperhatikan indeks 0. 
3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists!<br>
`Jawab : ` Pada Double Linked Lists, menambahkan di awal atau akhir (melalui addFirst atau addLast) berjalan dalam waktu konstan O(1), sedangkan menambahkan di posisi tengah memerlukan waktu linier O(n). Di sisi lain, pada Single Linked Lists, menambahkan di awal juga berjalan dalam waktu konstan O(1), namun menambahkan di posisi tengah atau akhir membutuhkan waktu linear O(n).<br>
4. Jelaskan perbedaan logika dari kedua kode program di bawah ini!<br>
`Jawab : `Perbedaan logika antara kedua kode program terletak pada cara pengecekan linked list kosong. Kode program a menggunakan variabel size untuk memeriksa jumlah elemen dalam linked list, sedangkan kode program b langsung memeriksa apakah pointer head adalah null, menunjukkan linked list kosong atau tidak.<br>

## **13.4 Tugas Pratikum**
### **Tugas 1 : program antrian vaksinasi menggunakan queue berbasis double linked list**
- Code `Node26.java`
```java
package Tugas1;

public class Node26 {
    int data;
    String nama;
    Node26 prev, next;

    public Node26(Node26 prev, int data, String nama, Node26 next) {
        this.prev = prev;
        this.data = data;
        this.nama = nama;
        this.next = next;
    }

}
```
- Code `AntrianVaksinasi.java`
```java
package Tugas1;

public class AntrianVaksinasi {
    Node26 head;
    int size;

    public AntrianVaksinasi() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int nomor, String nama) {
        if (isEmpty()) {
            head = new Node26(null, nomor, nama, null);
        } else {
            Node26 newNode = new Node26(null, nomor, nama, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int nomor, String nama) {
        if (isEmpty()) {
            addFirst(nomor, nama);
        } else {
            Node26 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node26 newNode = new Node26(current, nomor, nama, null);
            current.next = newNode;
            size++;
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            System.out.println(head.nama + " telah selesai divaksinasi.");
            removeLast();
        } else {
            System.out.println(head.nama + " telah selesai divaksinasi.");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian Vaksin masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            System.out.println(head.nama + " telah divaksinasi");
            head = null;
            size--;
            return;
        }
        Node26 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        System.out.println(current.next.nama + " telah divaksinasi");
        current.next = null;
        size--;
    }

    public String getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrean Vaksin kosong!");
        }
        return head.nama;
    }

    public int size() {
        return size;
    }

    public void print() {
        if (!isEmpty()) {
            Node26 tmp = head;
            System.out.println("=========================");
            System.out.println("Daftar Pengganti Vaksin");
            System.out.println("=========================");
            System.out.println("|No.\t| Nama \t\t|");
            System.out.println("=========================");
            while (tmp != null) {
                System.out.println("|" + tmp.data + "\t|" + tmp.nama + "\t\t|");
                tmp = tmp.next;
            }
            System.out.println("=========================");
            System.out.println("Sisa Antrian: " + size);
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
}
```

- Code `AntrianVaksinasiMain.java`
```java
package Tugas1;

import java.util.Scanner;

public class AntrianVaksinasiMain {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        AntrianVaksinasi dll = new AntrianVaksinasi();

        while (true) {
            System.out.println("==================================");
            System.out.println("| PENGANTRI VAKSIN EXTRAVAGANZA |");
            System.out.println("==================================");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengganti Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("==================================");
            System.out.print("Pilih: ");
            int choice = sc26.nextInt();
            sc26.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Data Penerima Vaksin\n");
                    System.out.print("Nomor Antrian: ");
                    int nomor = sc26.nextInt();
                    sc26.nextLine();
                    System.out.print("Nama Penerima: ");
                    String nama = sc26.nextLine();
                    dll.addLast(nomor, nama);
                    break;

                case 2:
                    try {
                        dll.removeFirst();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    dll.print();
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan ini.");
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
```
### **Tugas 1 : Verifikasi Hasil**
- Menambah Antrian
```java
==================================
| PENGANTRI VAKSIN EXTRAVAGANZA |
==================================
1. Tambah Data Penerima Vaksin
2. Hapus Data Pengganti Vaksin
3. Daftar Penerima Vaksin
4. Keluar
==================================
Pilih: 1
Masukkan Data Penerima Vaksin
Nomor Antrian: 26
Nama Penerima: Taufik
```
- Lihat Daftar Antrian
```java
==================================
| PENGANTRI VAKSIN EXTRAVAGANZA |
==================================
1. Tambah Data Penerima Vaksin
2. Hapus Data Pengganti Vaksin
3. Daftar Penerima Vaksin
4. Keluar
==================================
Pilih: 3
=========================
Daftar Pengganti Vaksin
=========================
|No.    | Nama          |
=========================
|26     |Taufik         |
|25     |Rio            |
|29     |vira           |
|21     |Petrus         |
=========================
Sisa Antrian: 4
```
- Hapus Antrian
```java
==================================
| PENGANTRI VAKSIN EXTRAVAGANZA |
==================================
1. Tambah Data Penerima Vaksin
2. Hapus Data Pengganti Vaksin
3. Daftar Penerima Vaksin
4. Keluar
==================================
Pilih: 2
Taufik telah selesai divaksinasi.
```

### **Tugas 2 : program antrian vaksinasi menggunakan queue berbasis double linked list**

- Code `Node26.java`
```java
package Tugas2;

public class Node26 {
    int id;
    String judul;
    double rating;
    Node26 prev, next;

    public Node26(int id, String judul, double rating, Node26 prev, Node26 next) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.prev = prev;
        this.next = next;
    }
}
```

- Code `DaftarFilm.java`
```java
package Tugas2;

public class DaftarFilm {
    Node26 head;
    Node26 tail;

    public DaftarFilm() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int id, String judul, double rating) {
        Node26 newNode = new Node26(id, judul, rating, null, head);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void addLast(int id, String judul, double rating) {
        Node26 newNode = new Node26(id, judul, rating, tail, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void insertAt(int index, int id, String judul, double rating) {
        if (index < 0 || index > size()) {
            System.out.println("data tidak ada ");
            return;
        }
        if (index == 0) {
            addFirst(id, judul, rating);
            return;
        }
        if (index == size()) {
            addLast(id, judul, rating);
            return;
        }
        Node26 current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node26 newNode = new Node26(id, judul, rating, current, current.next);
        current.next.prev = newNode;
        current.next = newNode;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("list kosong mazzeh");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong mazzeh");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= size()) {
            System.out.println("data tidak ada ");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size() - 1) {
            removeLast();
            return;
        }
        Node26 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
    }

    public int size() {
        int count = 0;
        Node26 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public Node26 CariId(int id) {
        Node26 current = head;
        while (current != null) {
            if (current.id == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("list kosong mazzeh");
            return;
        }
        Node26 current = head;
        System.out.println("ID\tJudul\tRating");
        while (current != null) {
            System.out.println(current.id + "\t" + current.judul + "\t" + current.rating);
            current = current.next;
        }
    }

    public void sortRatingDesc() {
        for (Node26 i = head; i != null; i = i.next) {
            for (Node26 j = head; j != null; j = j.next) {
                if (i.rating > j.rating) {
                    double tempRating = i.rating;
                    i.rating = j.rating;
                    j.rating = tempRating;

                    int tempId = i.id;
                    i.id = j.id;
                    j.id = tempId;

                    String tempJudul = i.judul;
                    i.judul = j.judul;
                    j.judul = tempJudul;
                }
            }
        }
    }
}
```

- Code `Main.java`
```java
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
```

### **Verifikasi Hasil**

- **Menu dan Penambahan Data**
```java
=====================================
|        Data Film Layar Lebar      |
=====================================
Menu:
1. Tambah data awal
2. Tambah data akhir
3. Tambah data pada indeks tertentu
4. Hapus data pertama
5. Hapus data terakhir
6. Hapus data pada indeks tertentu
7. Cetak data
8. Cari film berdasarkan ID
9. Urutan Data Rating Film-Desc
10. Keluar
=====================================
Pilihan: 1
Masukkan Data Film Posisi Awal 
Masukkan ID film: 1233
Masukkan judul film: One Piece
Masukkan rating film: 9.9
```
```java
=====================================
|        Data Film Layar Lebar      |
=====================================
Menu:
1. Tambah data awal
2. Tambah data akhir
3. Tambah data pada indeks tertentu
4. Hapus data pertama
5. Hapus data terakhir
6. Hapus data pada indeks tertentu
7. Cetak data
8. Cari film berdasarkan ID
9. Urutan Data Rating Film-Desc
10. Keluar
=====================================
Pilihan: 2
Masukkan Data Film Posisi Akhir
Masukkan ID film: 8776
Masukkan judul film: Kimi No Nawa
Masukkan rating film: 8.7
```
```java
=====================================
|        Data Film Layar Lebar      |
=====================================
Menu:
1. Tambah data awal
2. Tambah data akhir
3. Tambah data pada indeks tertentu
4. Hapus data pertama
5. Hapus data terakhir
6. Hapus data pada indeks tertentu
7. Cetak data
8. Cari film berdasarkan ID
9. Urutan Data Rating Film-Desc
10. Keluar
=====================================
Pilihan: 3
Masukkan Data Film Posisi Tertentu 
Masukkan No. Urutan: 1//mulai index 0
Masukkan ID film: 9987
Masukkan judul film: Koe No katachi
Masukkan rating film: 9.5
```
- **Cetak Data**
```java
=====================================
|        Data Film Layar Lebar      |
=====================================
Menu:
1. Tambah data awal
2. Tambah data akhir
3. Tambah data pada indeks tertentu
4. Hapus data pertama
5. Hapus data terakhir
6. Hapus data pada indeks tertentu
7. Cetak data
8. Cari film berdasarkan ID
9. Urutan Data Rating Film-Desc
10. Keluar
=====================================
Pilihan: 7
ID      Judul   Rating
1233    One Piece       9.9
9987    Koe No katachi  9.5
8776    Kimi No Nawa    8.7
```

- **Urutan Rating desc**
```java
Pilihan: 7
ID      Judul   Rating
1233    One Piece       9.9
9987    Koe No katachi  9.5
8776    Kimi No Nawa    8.7
5678    Seishun Buta Yarou      9.6
7272    Tenki no Ko     9.8
=====================================
|        Data Film Layar Lebar      |
=====================================
Menu:
1. Tambah data awal
2. Tambah data akhir
3. Tambah data pada indeks tertentu
4. Hapus data pertama
5. Hapus data terakhir
6. Hapus data pada indeks tertentu
7. Cetak data
8. Cari film berdasarkan ID
9. Urutan Data Rating Film-Desc
10. Keluar
=====================================
Pilihan: 9
Data telah diurutkan berdasarkan rating secara descending.
ID      Judul   Rating
1233    One Piece       9.9
7272    Tenki no Ko     9.8
5678    Seishun Buta Yarou      9.6
9987    Koe No katachi  9.5
8776    Kimi No Nawa    8.7
```
- **Pencarian Data**
```java
=====================================
|        Data Film Layar Lebar      |
=====================================
Menu:
1. Tambah data awal
2. Tambah data akhir
3. Tambah data pada indeks tertentu
4. Hapus data pertama
5. Hapus data terakhir
6. Hapus data pada indeks tertentu
7. Cetak data
8. Cari film berdasarkan ID
9. Urutan Data Rating Film-Desc
10. Keluar
=====================================
Pilihan: 8
Masukkan ID film yang ingin dicari: 1233
Film ditemukan:
ID: 1233
Judul: One Piece
Rating: 9.9
```