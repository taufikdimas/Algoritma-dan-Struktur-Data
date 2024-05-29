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