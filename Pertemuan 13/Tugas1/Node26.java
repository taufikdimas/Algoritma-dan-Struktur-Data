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
