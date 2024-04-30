package Tugas2;

class QueueLinkedList26 {
    Node26 front, rear;

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(Mahasiswa26 data) {
        Node26 Node = new Node26(data, null);
        if (isEmpty()) {
            front = Node;
            rear = Node;
        } else {
            rear.next = Node;
            rear = Node;
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
    }

    void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        Node26 temp = front;
        System.out.println("Antrian Layanan Unit Kemahasiswaan:");
        while (temp != null) {
            System.out.println("NIM: " + temp.data.NIM + ", Nama: " + temp.data.nama);
            temp = temp.next;
        }
    }
}
