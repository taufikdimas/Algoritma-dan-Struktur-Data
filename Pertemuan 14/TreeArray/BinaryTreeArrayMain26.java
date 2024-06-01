package TreeArray;

public class BinaryTreeArrayMain26 {
    public static void main(String[] args) {
        BinaryTreeArray26 bta = new BinaryTreeArray26();

        // Data awal binary tree
        int[] data = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("InOrder Traversal : ");
        bta.traverseInOrder(0); // Melakukan traversal inorder dari root
        System.out.println("\n");

        // Menambahkan data baru ke dalam binary tree
        bta.add(10);
        bta.add(2);

        // traversal pre-order
        System.out.print("PreOrder Traversal : ");
        bta.traversePreOrder(0);
        System.out.println("\n");

        // traversal post-order
        System.out.print("PostOrder Traversal : ");
        bta.traversePostOrder(0);
        System.out.println("\n");
    }
}
