package Tree;

public class BinaryTreeMain26 {
    public static void main(String[] args) {
        try {
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

            // Menambahkan node secara rekursif
            bt.addRekursif(11);
            bt.addRekursif(2);
            System.out.print("PreOrder Rekursif : ");
            bt.traversePreOrder(bt.root);
            System.out.println("");

            // Menampilkan nilai terkecil dan terbesar dalam tree
            System.out.println("Nilai Terkecil dalam Tree: " + bt.findMinValue());
            System.out.println("Nilai Terbesar dalam Tree: " + bt.findMaxValue());

            // Menampilkan data yang ada di leaf
            System.out.print("Data yang ada di Leaf: ");
            bt.printLeaf();
            System.out.println("");

            // Menampilkan jumlah leaf dalam tree
            System.out.println("Jumlah Leaf dalam Tree: " + bt.countLeaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
