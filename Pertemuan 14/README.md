# <p align="center">JOBSHEET 13 - Tree</p>

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
### **13.1.1 Implementasi Binary Search Tree menggunakan Linked List**

- Code `Node26.java`

```java
package Tree;

class Node26 {
    int data;
    Node26 left, right;

    public Node26() {
    }

    public Node26(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
```

- Code `BinaryTree26.java`
```java
package Tree;

class BinaryTree26 {
    Node26 root;

    public BinaryTree26() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) { // Perbaikan di sini
            root = new Node26(data);
        } else {
            Node26 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left == null) {
                        current.left = new Node26(data); // Perbaikan di sini
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (data > current.data) {
                    if (current.right == null) {
                        current.right = new Node26(data); // Perbaikan di sini
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node26 current = root;
        while (current != null) { // Perbaikan di sini
            if (current.data == data) {
                result = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    public void traversePreOrder(Node26 node) {
        if (node != null) {
            System.out.print(node.data + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node26 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node26 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    Node26 getSuccessor(Node26 del) {
        Node26 successor = del.right;
        Node26 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        Node26 parent = root;
        Node26 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("couldn't find data");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { // Perbaikan di sini
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { // Perbaikan di sini
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node26 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
                successor.left = current.left;
            }
        }
    }
}

```

-Code `BinaryTreeMain26.java`
```java
package Tree;

public class BinaryTreeMain26 {
    public static void main(String[] args) {
        BinaryTree26 bt = new BinaryTree26();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        System.out.print("InOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");

        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");

        System.out.println("Cari Node 5: " + bt.find(5));

        System.out.println("Hapus Node 8");
        bt.delete(8);

        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
    }
}
```

### **13.1.2 Verifikasi Percobaan**
```java
PreOrder Traversal : 6 4 3 5 8 7 9 10 15
InOrder Traversal : 3 4 5 6 7 8 9 10 15
PostOrder Traversal : 3 5 4 7 15 10 9 8 6
Cari Node 5: true
Hapus Node 8
PreOrder Traversal : 6 4 3 5 9 7 10 15
PS D:\Github\Algoritma-dan-Struktur-Data\Pertemuan 14>
```
### **13.1.3 Pertanyaan**
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?<br>
`Jawab :` Binary search tree (BST) memungkinkan pencarian lebih cepat karena setiap node memiliki properti di mana nilai di sub-pohon kiri lebih kecil dan nilai di sub-pohon kanan lebih besar, seperti pencarian biner pada array terurut.<br>
2. Untuk apakah di class Node, kegunaan dari atribut left dan right?<br>
`Jawab :`
3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?<br>
`Jawab :` Atribut root di dalam class BinaryTree digunakan untuk menyimpan referensi ke root node dari tree.<br>
   b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?<br>
`Jawab :`Ketika objek tree pertama kali dibuat, nilai dari root adalah null. Ini menunjukkan bahwa tree masih kosong dan belum ada node yang dimasukkan ke dalamnya.<br>
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?<br>
`Jawab :` Ketika tree masih kosong (di mana root adalah null), dan akan ditambahkan sebuah node baru, node baru tersebut akan menjadi node akar (root node) dari tree. Prosesnya melibatkan pengaturan atribut root untuk menunjuk ke node baru yang ditambahkan, sehingga node tersebut menjadi titik awal tree.<br>
5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?<br>
```java
if(data<current.data){
 if(current.left!=null){
 current = current.left;
 }else{
 current.left = new Node(data);
 break;
 }
}
```
`jawab` Baris tersebut digunakan untuk menambahkan node baru ke dalam BST. Pertama, dilakukan pengecekan apakah nilai data yang akan ditambahkan lebih kecil dari nilai data pada node saat ini. Jika ya, maka dilakukan pengecekan apakah terdapat anak kiri dari node saat ini. Jika ada, proses pindah ke anak kiri dilakukan, jika tidak ada, node baru dibuat dan ditempatkan sebagai anak kiri dari node saat ini.<br>

## **13.2 Kegiatan Pratikum 2**
### **13.2.1 Implementasi binary tree dengan array**

- Code `BinaryTreeArray26.java`
```java
package TreeArray;

public class BinaryTreeArray26 {
    int[] data;
    int idxLast;

    public BinaryTreeArray26() {
        data = new int[10];
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }
}
```
- Code `BinaryTreeArrayMain26.java`
```java
package TreeArray;

public class BinaryTreeArrayMain26 {
    public static void main(String[] args) {
        BinaryTreeArray26 bta = new BinaryTreeArray26();

        int[] data = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");
    }
}
```
### **13.2.2 Verifikasi Percobaan**
```java
InOrder Traversal : 3 4 5 6 7 8 9

PS D:\Github\Algoritma-dan-Struktur-Data\Pertemuan 14>
```

### **13.2.3 Pertanyaan**
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?<br>
`Jawab :` Atribut data digunakan untuk menyimpan data dari binary tree, sedangkan idxLast digunakan untuk menyimpan indeks terakhir dari data binary tree.<br>
2. Apakah kegunaan dari method populateData()?<br>
`Jawab :` Method populateData() digunakan untuk mengisi data binary tree dengan data yang diberikan dan menyimpan indeks terakhir dari data binary tree.<br>
3. Apakah kegunaan dari method traverseInOrder()?<br>
`Jawab :` Method traverseInOrder() digunakan untuk melakukan traversal inorder dari binary tree, yaitu dengan mengunjungi node kiri, mencetak node saat ini, dan mengunjungi node kanan.<br>
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masin-masing?<br>
`Jawab :` Method traverseInOrder() digunakan untuk melakukan traversal inorder dari binary tree, yaitu dengan mengunjungi node kiri, mencetak node saat ini, dan mengunjungi node kanan.<br>
5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?<br>
`Jawab :` Pernyataan int idxLast = 6 pada praktikum 2 percobaan nomor 4 digunakan untuk menunjukkan bahwa indeks terakhir dari data binary tree adalah 6, sehingga hanya data pada indeks 0 hingga 6 yang valid dalam traversal.<br>

## **13.3 Tugas Pratikum**
1. Buat method di dalam class BinaryTree yang akan menambahkan node dengan cara rekursif.<br>
```java
    private Node26 addRekursif(Node26 current, int data) {
        if (current == null) {
            return new Node26(data);
        }

        if (data < current.data) {
            current.left = addRekursif(current.left, data);
        } else if (data > current.data) {
            current.right = addRekursif(current.right, data);
        }

        return current;
    }

    public void addRekursif(int data) {
        root = addRekursif(root, data);
    }
```
2. Buat method di dalam class BinaryTree untuk menampilkan nilai paling kecil dan yang paling besar yang ada di dalam tree.<br>
```java
    public int findMinValue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Tree is empty");
        }

        Node26 current = root;
        while (current.left != null) {
            current = current.left;
        }

        return current.data;
    }
    public int findMaxValue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Tree is empty");
        }
        Node26 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }
```
3. Buat method di dalam class BinaryTree untuk menampilkan data yang ada di leaf.<br>
```java
    public void printLeaf() {
        printLeaf(root);
    }

    private void printLeaf(Node26 node) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }

        printLeaf(node.left);
        printLeaf(node.right);
    }
```

4. Buat method di dalam class BinaryTree untuk menampilkan berapa jumlah leaf yang ada di dalam tree.<br>
```java
    public int countLeaf() {
        return countLeaf(root);
    }

    private int countLeaf(Node26 node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }

        return countLeaf(node.left) + countLeaf(node.right);
    }
```
- **output 1 sampai 4**
```java
PreOrder Rekursif : 6 4 3 2 5 9 7 10 15 11
Nilai Terkecil dalam Tree: 2
Nilai Terbesar dalam Tree: 15
Data yang ada di Leaf: 2 5 7 11
Jumlah Leaf dalam Tree: 4
```

5. Modifikasi class BinaryTreeArray, dan tambahkan :<br>

• method add(int data) untuk memasukan data ke dalam tree<br>
```java
 void add(int data) {
        if (idxLast < this.data.length - 1) { 
            idxLast++;
            this.data[idxLast] = data;
        } else {
            System.out.println("Tree Sudah Full, gak iso di tambah maneh");
        }
    }
```
• method traversePreOrder() dan traversePostOrder()<br>
```java
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " "); 
            traversePreOrder(2 * idxStart + 1); 
            traversePreOrder(2 * idxStart + 2); 
        }
    }
```
```java
 void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1); 
            traversePostOrder(2 * idxStart + 2); 
            System.out.print(data[idxStart] + " "); 
        }
    }
```
- **Output**
```java
InOrder Traversal : 3 4 5 6 7 8 9 

PreOrder Traversal : 6 4 3 10 2 5 8 7 9

PostOrder Traversal : 10 2 3 5 4 7 9 8 6

PS D:\Github\Algoritma-dan-Struktur-Data\Pertemuan 14> 
```