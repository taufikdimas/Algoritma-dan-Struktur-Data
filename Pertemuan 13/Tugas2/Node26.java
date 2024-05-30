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
