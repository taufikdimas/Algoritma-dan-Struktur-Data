# <p align="center">JOBSHEET IX - Linked List</p>

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

## **11.1 Pembuatan Single Linked List**
### **11.1.1. Langkah-langkah Percobaan**

``` Class Node26```
```java
package minggu11;

class Node26 {
    int data;
    Node26 next;

    Node26(int nilai, Node26 berikutnya) {
        data = nilai;
        next = berikutnya;
    }
}
```

``` Class SingleLinkedList26```
```java
package minggu11;

public class SingleLinkedList26 {
    Node26 head, tail;

    boolean isEmpty() {// KONDISI HEADNYA HARUS BERISI NULL
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node26 tmp = head;
            System.out.print("Isi Linked List : ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input) {
        Node26 ndInput = new Node26(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node26 ndInput = new Node26(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node26 ndInput = new Node26(input, null);
        Node26 temp = head;
        boolean keyFound = false;

        while (temp != null) {
            if (temp.data == key) {
                keyFound = true;
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }

        if (!keyFound) {
            System.out.println("Key tidak ditemukan");
        }
    }

    void insertArt(int index, int input) {
        Node26 ndInput = new Node26(input, null);
        if (index < 0) {
            System.out.println("Index Tidak Valid");
            return;
        } else if (index == 0) {
            addFirst(input);
            return;
        }

        Node26 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = new Node26(input, temp.next);
        if (temp.next.next == null) {
            tail = temp.next;
        }
    }

}
```

``` Class SLImain```
```java
package minggu11;

public class SLImain {
    public static void main(String[] args) {
        SingleLinkedList26 singLL = new SingleLinkedList26();

        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertArt(3, 833);
        singLL.print();
    }
}
```


### **11.1.2 Verifikasi hasil percobaan**

```java 
Linked List Kosong
Isi Linked List : 890
Isi Linked List : 890   760
Isi Linked List : 700   890     760
Isi Linked List : 700   999     890     760
Isi Linked List : 700   999     890     833     760
PS D:\Github\Algoritma-dan-Struktur-Data>
```

### **11.1.3 Pertanyaan
<strong><p>1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?<p>
Jawab : karena pada saat memanggil print() di baris pertama, tidak ada elemen yang ditambahkan ke linked list sebelumnya. Oleh karena itu, ketika print() dipanggil, metode isEmpty() akan mengembalikan true karena head masih null, sehingga mencetak pesan "Linked List Kosong".<br>
<strong><p>2. Jelaskan kegunaan variable temp secara umum pada setiap method!<p>
 Jawab : Variabel temp digunakan untuk menginisialisasi penelusuran dari node pertama (head) hingga node terakhir (tail) dalam linked list.

Method addFirst():
    Variabel temp tidak digunakan dalam metode ini karena penambahan node baru dilakukan di awal linked list.

Method addLast():
    variabel temp digunakan untuk mencapai node terakhir dalam linked list sehingga node baru dapat ditambahkan setelahnya.

Method insertAfter():
    temp digunakan untuk menemukan node dengan nilai yang sesuai dengan kunci yang ditentukan.

Method insertAt():
    variabel temp digunakan untuk mencapai node sebelum indeks yang ditentukan sehingga node baru dapat dimasukkan setelahnya.</p>
<strong><p>3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut<p> 
 digunakan untuk memeriksa apakah node yang baru ditambahkan akan menjadi node terakhir dalam linked list. Jika ya, tail harus diperbarui agar menunjuk ke node yang baru ditambahkan.<br>

## **11.2 Modifikasi Elemen pada Single Linked List**
### **11.2.1. Langkah-langkah Percobaan** 

``` Modifikasi Class SingleLinkedList26```
```Java 
package minggu11;

public class SingleLinkedList26 {
    Node26 head, tail;

    boolean isEmpty() {// KONDISI HEADNYA HARUS BERISI NULL
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node26 tmp = head;
            System.out.print("Isi Linked List : ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input) {
        Node26 ndInput = new Node26(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node26 ndInput = new Node26(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node26 ndInput = new Node26(input, null);
        Node26 temp = head;
        boolean keyFound = false;

        while (temp != null) {
            if (temp.data == key) {
                keyFound = true;
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }

        if (!keyFound) {
            System.out.println("Key tidak ditemukan");
        }
    }

    void insertArt(int index, int input) {
        Node26 ndInput = new Node26(input, null);
        if (index < 0) {
            System.out.println("Index Tidak Valid");
            return;
        } else if (index == 0) {
            addFirst(input);
            return;
        }

        Node26 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = new Node26(input, temp.next);
        if (temp.next.next == null) {
            tail = temp.next;
        }
    }

    int getData(int index) {
        Node26 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int indexOf(int key) {
        Node26 temp = head;
        int index = 0;
        while (temp != null && temp.data != key) {
            temp = temp.next;
            index++;
        }
        if (temp == null) {
            return -1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node26 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else {
            Node26 temp = head;
            while (temp != null) {
                if (temp.data != key && temp == head) {
                    removeFirst();
                    break;
                } else if (temp.next != null && temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node26 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }

    }
}
```

``` Modifikasi Class SLImain```
```java
package minggu11;

public class SLImain {
    public static void main(String[] args) {
        SingleLinkedList26 singLL = new SingleLinkedList26();

        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertArt(3, 833);
        singLL.print();

        System.out.println("Data pada indeks ke-1= " + singLL.getData(1));
        System.out.println("Data 3 berada pada indeks ke-" + singLL.indexOf(760));

        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
    }
}
```

### **11.2.2.Verifikasi Hasil Percobaan**

``` java
Linked List Kosong
Isi Linked List : 890
Isi Linked List : 890   760
Isi Linked List : 700   890     760
Isi Linked List : 700   999     890     760
Isi Linked List : 700   999     890     833     760
Data pada indeks ke-1= 999
Data 3 berada pada indeks ke-4
Isi Linked List : 999   890     833     760
Isi Linked List : 890   833     760
Isi Linked List : 833   760
Isi Linked List : 833
PS D:\Github\Algoritma-dan-Struktur-Data> 
```

### **11.2.3 Pertanyaan**
<strong>1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!<br>
<p>Jawab : untuk menghentikan iterasi dan keluar dari loop setelah operasi penghapusan berhasil dilakukan<p>
<strong>2. Jelaskan kegunaan kode dibawah pada method remove<br>
<p>Jawab : Kode tersebut menghapus node yang memiliki nilai data yang sama dengan key. Jika temp memiliki node selanjutnya dan nilai data dari node selanjutnya sama dengan key, maka node selanjutnya dihapus dengan mengubah next dari node saat ini menjadi node setelahnya. Ini memastikan bahwa node dengan nilai key dilewati dalam linked list, sehingga terjadi penghapusan.<p>


## **Tugas**
**1. Implementasikan ilustrasi Linked List Berikut. Gunakan 4 macam penambahan data yang telah dipelajari sebelumnya untuk menginputkan data**
```clas LinkedList```
```java
package Tugas1;

public class LinkedList26 {
    Node26 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node26 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                System.out.println("NIM: " + tmp.data.NIM + " Nama: " + tmp.data.nama);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(Mahasiswa26 data) {
        Node26 ndInput = new Node26(data, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(Mahasiswa26 data) {
        Node26 ndInput = new Node26(data, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int NIMKey, Mahasiswa26 data) {
        Node26 ndInput = new Node26(data, null);
        Node26 temp = head;
        boolean keyFound = false;

        while (temp != null) {
            if (temp.data.NIM == NIMKey) {
                keyFound = true;
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }

        if (!keyFound) {
            System.out.println("NIM tidak ditemukan");
        }
    }

    void insertAt(int index, Mahasiswa26 data) {
        Node26 ndInput = new Node26(data, null);
        if (index < 0) {
            System.out.println("Index Tidak Valid");
            return;
        } else if (index == 0) {
            addFirst(data);
            return;
        }

        Node26 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = new Node26(data, temp.next);
        if (temp.next.next == null) {
            tail = temp.next;
        }
    }
}
```
``` Class Main```
```java
package Tugas1;

public class LinkedListMain26 {
    public static void main(String[] args) {
        LinkedList26 singLL = new LinkedList26();

        singLL.print();
        singLL.addFirst(new Mahasiswa26(111, "Anton"));
        singLL.print();
        singLL.addLast(new Mahasiswa26(112, "Prita"));
        singLL.print();
        singLL.insertAfter(112, new Mahasiswa26(113, "Yusuf"));
        singLL.print();
        singLL.insertAfter(113, new Mahasiswa26(114, "Doni"));
        singLL.print();
        singLL.insertAt(4, new Mahasiswa26(115, "Sari"));
        singLL.print();

    }
}
```
``` Verifikasi Hasil```
```java
Linked List Kosong
Isi Linked List:
NIM: 111 Nama: Anton
Isi Linked List:
NIM: 111 Nama: Anton
NIM: 112 Nama: Prita
Isi Linked List:
NIM: 111 Nama: Anton
NIM: 112 Nama: Prita
NIM: 113 Nama: Yusuf
Isi Linked List:
NIM: 111 Nama: Anton
NIM: 112 Nama: Prita
NIM: 113 Nama: Yusuf
NIM: 114 Nama: Doni
Isi Linked List:
NIM: 111 Nama: Anton
NIM: 112 Nama: Prita
NIM: 113 Nama: Yusuf
NIM: 114 Nama: Doni
NIM: 115 Nama: Sari
PS D:\Github\Algoritma-dan-Struktur-Data>
```

**2. Buatlah implementasi program antrian layanan unit kemahasiswaan sesuai dengan kondisi yang ditunjukkan pada soal nomor 1,Implementasi antrian menggunakan Queue berbasis Linked List!**
``` Class QueueLinkedList```
```java
ppackage Tugas2;

class QueueLinkedList26 {
    Node26 front, rear;

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(Mahasiswa26 data) {
        Node26 Node = new Node26(data, null);
        if (isEmpty()) {
            front = Node;
            rear = Node;
        } else {
            rear.next = Node;
            rear = Node;
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
    }

    void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        Node26 temp = front;
        System.out.println("Antrian Layanan Unit Kemahasiswaan:");
        while (temp != null) {
            System.out.println("NIM: " + temp.data.NIM + ", Nama: " + temp.data.nama);
            temp = temp.next;
        }
    }
}
```
``` Clas Main```
```java
package Tugas2;

public class QueueLinkedListMain26 {
    public static void main(String[] args) {
        QueueLinkedList26 queue = new QueueLinkedList26();

        // Enqueue beberapa mahasiswa
        queue.enqueue(new Mahasiswa26(111, "Anton"));
        queue.enqueue(new Mahasiswa26(112, "Prita"));
        queue.enqueue(new Mahasiswa26(113, "Yusuf"));
        queue.enqueue(new Mahasiswa26(114, "Doni"));
        queue.enqueue(new Mahasiswa26(115, "Sari"));

        // Tampilkan antrian
        queue.displayQueue();

        // Dequeue 2 kali
        queue.dequeue();
        queue.dequeue();

        // Tampilkan antrian setelah dequeue
        queue.displayQueue();
    }
}
```
``` Verifikasi Hasil Percobaan```
```java
Antrian Layanan Unit Kemahasiswaan:
NIM: 111, Nama: Anton
NIM: 112, Nama: Prita
NIM: 113, Nama: Yusuf
NIM: 114, Nama: Doni
NIM: 115, Nama: Sari
Antrian Layanan Unit Kemahasiswaan:
NIM: 113, Nama: Yusuf
NIM: 114, Nama: Doni
NIM: 115, Nama: Sari
PS D:\Github\Algoritma-dan-Struktur-Data> 
```