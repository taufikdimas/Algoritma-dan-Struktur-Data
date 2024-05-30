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
