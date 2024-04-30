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
            while (temp.next != null) {
                if (temp.next.data == key) {
                    if (temp.next == tail) {
                        tail = temp;
                    }
                    temp.next = temp.next.next;
                    return;
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