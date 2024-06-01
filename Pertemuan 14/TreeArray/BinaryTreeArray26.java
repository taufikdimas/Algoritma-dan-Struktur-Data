package TreeArray;

public class BinaryTreeArray26 {
    int[] data; // Array untuk menyimpan data
    int idxLast;

    public BinaryTreeArray26() {
        data = new int[10]; // Inisialisasi array data dengan panjang 10
    }

    void populateData(int data[], int idxLast) {
        this.data = data; // Menyimpan data
        this.idxLast = idxLast; // Menyimpan indeks terakhir dari binary tree
    }

    void add(int data) {
        if (idxLast < this.data.length - 1) {
            idxLast++;
            this.data[idxLast] = data;
        } else {
            System.out.println("Tree Sudah Full, gak iso di tambah maneh");
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1); // Traverse ke kiri dari node saat ini
            System.out.print(data[idxStart] + " "); // Mencetak data node saat ini
            traverseInOrder(2 * idxStart + 2); // Traverse ke kanan dari node saat ini
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
