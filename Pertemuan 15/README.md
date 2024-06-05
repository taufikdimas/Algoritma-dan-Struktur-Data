# <p align="center">JOBSHEET 12 - Graph</p>

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

## **14.1 Percobaan 1: Implementasi Graph menggunakan Linked List**
### **14.1.1 Langkah-langkah Percobaan**

- Code `Node26.java`
``java
package Graph;

public class Node26 {
    int data;
    Node26 prev, next;
    int jarak;

    Node26(Node26 prev, int data, int jarak, Node26 next) {
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }
}
```

- Code `DoubleLinkedList26.java`
```java
package Graph;

public class DoubleLinkedList26 {
    Node26 head;
    int size;

    public DoubleLinkedList26() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node26(null, item, jarak, null);
        } else {
            Node26 newNode = new Node26(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int gerJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node26 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void addLast(int item, int jarak) {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else {
            Node26 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node26 newNode = new Node26(current, item, jarak, null);
            current.next = newNode;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void remove(int index) throws Exception {
        Node26 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                size--;
                break;
            }
            current = current.next;
        }
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
}
```

- Code `Graph26.java`
```java
package Graph;

public class Graph26 {
    int vertex;
    DoubleLinkedList26 list[];

    public Graph26(int v) {
        this.vertex = v;
        list = new DoubleLinkedList26[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList26();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addLast(tujuan, jarak);
        // list[tujuan].addLast(asal, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
        }
        totalOut = list[asal].size();
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + " = " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + " = " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + " = " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        list[asal].remove(tujuan);
        list[tujuan].remove(asal);
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan : ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].gerJarak(j) + " m), ");
                }
                System.out.println();
            }
        }
    }
}
```

- Code `GraphMain26.java`
```java
package Graph;

public class GraphMain26 {
    public static void main(String[] args) throws Exception {
        Graph26 gedung = new Graph26(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        // gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();
    }
}
```

### **14.1.2 Verifikasi Percobaan**
- Hasil running pada langkah 14
```java
InDegree dari Gedung A = 0
OutDegree dari Gedung A = 2
Degree dari Gedung A = 2
Gedung A terhubung dengan :
B (50 m), C (100 m),
Gedung B terhubung dengan :
D (70 m),
Gedung C terhubung dengan :
D (40 m),
Gedung D terhubung dengan :
E (60 m),
Gedung E terhubung dengan :
F (80 m),
PS D:\Github\Algoritma-dan-Struktur-Data\Pertemuan 15> 
```

- Hasil running pada langkah 17
```java
InDegree dari Gedung A = 0
OutDegree dari Gedung A = 2
Degree dari Gedung A = 2
Gedung A terhubung dengan :
B (50 m), C (100 m),
Gedung C terhubung dengan :
D (40 m),
Gedung D terhubung dengan :
E (60 m),
Gedung E terhubung dengan :
F (80 m),
PS D:\Github\Algoritma-dan-Struktur-Data\Pertemuan 15> 
```

### **14.1.3 Pertanyaan**
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai!<br>
`Jawab :`Alhamdulilah lancar
2. Pada class Graph, terdapat atribut list[] bertipe DoubleLinkedList. Sebutkan tujuan pembuatan variabel tersebut!<br>
`Jawab :` Variabel list[] bertipe DoubleLinkedList digunakan untuk menyimpan daftar node-node yang terhubung dengan setiap simpul (node) dalam graf.<br>
3. Jelaskan alur kerja dari method removeEdge!<br>
`Jawab :` Method removeEdge() bekerja dengan menghapus koneksi (edge) antara dua simpul yang diberikan, yaitu simpul asal dan simpul tujuan. Pertama, method ini menghapus koneksi dari simpul asal ke simpul tujuan dengan memanggil method remove() pada list[simpul asal]. Kemudian, method menghapus koneksi dari simpul tujuan ke simpul asal dengan memanggil method remove() pada list[simpul tujuan].<br>
4. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add jenis lain saat digunakan pada method addEdge pada class Graph?<br>
`Jawab : ` Method addFirst() digunakan dalam method addEdge() karena tujuan utamanya adalah untuk menambahkan koneksi (edge) baru antara dua simpul dalam graf. Dengan menggunakan addFirst(), koneksi baru ditambahkan di awal daftar koneksi untuk simpul asal.<br>
5. Modifikasi kode program sehingga dapat dilakukan pengecekan apakah terdapat jalur antara suatu node dengan node lainnya, seperti contoh berikut (Anda dapat memanfaatkan Scanner)<br>
`Jawab :`
- code tambahan main
```java
 Scanner sc26 = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan Gedung Asal: ");
            int asal = sc26.nextInt();
            System.out.print("Masukkan Gedung Tujuan: ");
            int tujuan = sc26.nextInt();

            if (gedung.isTetangga(asal, tujuan)) {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
            } else {
                System.out.println(
                        "Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
            }
            System.out.print("Lanjutkan? (Y/N): ");
            String lanjut = sc26.next();
            if (!lanjut.equalsIgnoreCase("Y")) {
                break;
            }
        }
        sc26.close();
```
- Code tambahan graph
```java
    public boolean isTetangga(int asal, int tujuan) throws Exception {
        return isTetanggaDekat(asal, tujuan) || isTetanggaDekat(tujuan, asal);
    }

    private boolean isTetanggaDekat(int asal, int tujuan) throws Exception {
        if (asal >= 0 && asal < vertex && list[asal].size() > 0) {
            for (int i = 0; i < list[asal].size(); i++) {
                int nextNode = list[asal].get(i);
                if (nextNode == tujuan) {
                    return true;
                }
            }
        }
        return false;
    }
```
- Output
```java
Masukkan Gedung Asal: 2
Masukkan Gedung Tujuan: 3
Gedung C dan D bertetangga
Masukkan Gedung Asal: 4
Masukkan Gedung Tujuan: 5
Gedung E dan F bertetangga
Masukkan Gedung Asal: 1
Masukkan Gedung Tujuan: 4
Gedung B dan E tidak bertetangga
```

## **14.2 Percobaan 2: Implementasi Graph menggunakan Matriks**
### **14.2.1 Langkah-langkah Percobaan**
- Code `GraphMatriks26.java`
```java
package Graph;

public class GraphMatriks26 {
    int vertex;
    int[][] matriks;

    public GraphMatriks26(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + " : ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " ( " + matriks[i][j] + " m),");
                }
            }
            System.out.println();
        }
    }
}
```
- Code `GrapMain26.java`
```java
 GraphMatriks26 gdg = new GraphMatriks26(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
```
### **14.2.2 Verifikasi Percobaan**
```java
Gedung A : Gedung A ( 0 m),Gedung B ( 50 m),Gedung C ( 0 m),Gedung D ( 0 m),
Gedung B : Gedung A ( 60 m),Gedung B ( 0 m),Gedung C ( 70 m),Gedung D ( 0 m),
Gedung C : Gedung A ( 0 m),Gedung B ( 80 m),Gedung C ( 0 m),Gedung D ( 40 m),
Gedung D : Gedung A ( 90 m),Gedung B ( 0 m),Gedung C ( 0 m),Gedung D ( 0 m),
Hasil setelah penghapusan edge
Gedung A : Gedung A ( 0 m),Gedung B ( 50 m),Gedung C ( 0 m),Gedung D ( 0 m),
Gedung B : Gedung A ( 60 m),Gedung B ( 0 m),Gedung C ( 70 m),Gedung D ( 0 m),
Gedung C : Gedung A ( 0 m),Gedung B ( 0 m),Gedung C ( 0 m),Gedung D ( 40 m),
Gedung D : Gedung A ( 90 m),Gedung B ( 0 m),Gedung C ( 0 m),Gedung D ( 0 m),
PS D:\Github\Algoritma-dan-Struktur-Data\Pertemuan 15>
```

### **14.2.3 Pertanyaan**
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai!<br>
`Jawab : ` alhamdulilah tidak ada
2. Apa jenis graph yang digunakan pada Percobaan 2?<br>
`Jawab : `  jenis graph berbentuk Matriks yang direpresentasikan menggunakan matriks adjacency. Setiap elemen matriks menyimpan nilai jarak antara dua simpul yang terhubung.<br>
3. Apa maksud dari dua baris kode berikut?<br>
`Jawab : `digunakan untuk menambahkan edge antara simpul 1 dan 2 dengan jarak masing-masing 70 dan 80<br>
4. Modifikasi kode program sehingga terdapat method untuk menghitung degree, termasuk inDegree dan outDegree!<br>
`Jawab :`
- kode program untuk emnghitung degree
```java
public void degree() {
        for (int v = 0; v < vertex; v++) {
            int totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                if (matriks[i][v] != 0) {
                    totalIn++;
                }
                if (matriks[v][i] != 0) {
                    totalOut++;
                }
            }
            System.out.println("InDegree dari Gedung " + (char) ('A' + v) + " = " + totalIn);
            System.out.println("OutDegree dari Gedung " + (char) ('A' + v) + " = " + totalOut);
            System.out.println("Degree dari Gedung " + (char) ('A' + v) + " = " + (totalIn + totalOut));
            System.out.println();
        }
    }
```
- Output
```java
Gedung A : Gedung A ( 0 m),Gedung B ( 50 m),Gedung C ( 0 m),Gedung D ( 0 m),
Gedung B : Gedung A ( 60 m),Gedung B ( 0 m),Gedung C ( 70 m),Gedung D ( 0 m),
Gedung C : Gedung A ( 0 m),Gedung B ( 80 m),Gedung C ( 0 m),Gedung D ( 40 m),
Gedung D : Gedung A ( 90 m),Gedung B ( 0 m),Gedung C ( 0 m),Gedung D ( 0 m),
Hasil setelah penghapusan edge
Gedung A : Gedung A ( 0 m),Gedung B ( 50 m),Gedung C ( 0 m),Gedung D ( 0 m),
Gedung B : Gedung A ( 60 m),Gedung B ( 0 m),Gedung C ( 70 m),Gedung D ( 0 m),
Gedung C : Gedung A ( 0 m),Gedung B ( 0 m),Gedung C ( 0 m),Gedung D ( 40 m),
Gedung D : Gedung A ( 90 m),Gedung B ( 0 m),Gedung C ( 0 m),Gedung D ( 0 m),
InDegree dari Gedung A = 2
OutDegree dari Gedung A = 1
Degree dari Gedung A = 3

InDegree dari Gedung B = 1
OutDegree dari Gedung B = 2
Degree dari Gedung B = 3

InDegree dari Gedung C = 1
OutDegree dari Gedung C = 1
Degree dari Gedung C = 2

InDegree dari Gedung D = 1
OutDegree dari Gedung D = 1
Degree dari Gedung D = 2

PS D:\Github\Algoritma-dan-Struktur-Data\Pertemuan 15>
```
## ** Latihan Pratikum **
1. Modifikasi kode program pada class GraphMain sehingga terdapat menu program yang bersifat dinamis, setidaknya terdiri dari:<br>
a) Add Edge<br>
b) Remove Edge<br>
c) Degree<br>
d) Print Graph<br>
e) Cek Edge<br>
Pengguna dapat memilih menu program melalui input Scanner<br>
```java
Menu:
 while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("8. Exit");
            System.out.print("Pilih menu: ");
            int choice = sc26.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Gedung Asal: ");
                    int asal = sc26.nextInt();
                    System.out.print("Masukkan Gedung Tujuan: ");
                    int tujuan = sc26.nextInt();
                    System.out.print("Masukkan Jarak: ");
                    int jarak = sc26.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan Gedung Asal: ");
                    asal = sc26.nextInt();
                    System.out.print("Masukkan Gedung Tujuan: ");
                    tujuan = sc26.nextInt();
                    gedung.removeEdge(asal, tujuan);
                    break;
                case 3:
                    System.out.print("Masukkan Gedung: ");
                    asal = sc26.nextInt();
                    gedung.degree(asal);
                    break;
                case 4:
                    gedung.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan Gedung Asal: ");
                    asal = sc26.nextInt();
                    System.out.print("Masukkan Gedung Tujuan: ");
                    tujuan = sc26.nextInt();
                    if (gedung.isTetangga(asal, tujuan)) {
                        System.out.println(
                                "Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
                    } else {
                        System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan)
                                + " tidak bertetangga");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan Gedung Asal: ");
                    asal = sc26.nextInt();
                    System.out.print("Masukkan Gedung Tujuan: ");
                    tujuan = sc26.nextInt();
                    System.out.print("Masukkan Jarak Baru: ");
                    jarak = sc26.nextInt();
                    gedung.updateJarak(asal, tujuan, jarak);
                    break;
                case 7:
                    System.out.println("Jumlah Edge dalam Graf: " + gedung.hitungEdge());
                    break;
                case 8:
                    sc26.close();
                    System.out.println("Program selesai.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } 
```
2. Tambahkan method updateJarak pada Percobaan 1 yang digunakan untuk mengubah jarak antara dua node asal dan tujuan!<br>
```java
public void updateJarak(int asal, int tujuan, int jarak) throws Exception {
        Node26 current = list[asal].head;
        while (current != null) {
            if (current.data == tujuan) {
                current.jarak = jarak;
                break;
            }
            current = current.next;
        }
    }
```
3. Tambahkan method hitungEdge untuk menghitung banyaknya edge yang terdapat di dalam graf!<br>
```java
public int hitungEdge() {
        int count = 0;
        for (int i = 0; i < vertex; i++) {
            count += list[i].size();
        }
        return count;
    }
```