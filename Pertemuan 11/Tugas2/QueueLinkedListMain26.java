package Tugas2;

public class QueueLinkedListMain26 {
    public static void main(String[] args) {
        QueueLinkedList26 queue = new QueueLinkedList26();

        // Enqueue beberapa mahasiswa
        queue.enqueue(new Mahasiswa26(111, "Anton"));
        queue.enqueue(new Mahasiswa26(112, "Prita"));
        queue.enqueue(new Mahasiswa26(113, "Yusuf"));
        queue.enqueue(new Mahasiswa26(114, "Doni"));
        queue.enqueue(new Mahasiswa26(115, "Sari"));

        // Tampilkan antrian
        queue.displayQueue();

        // Dequeue 2 kali
        queue.dequeue();
        queue.dequeue();

        // Tampilkan antrian setelah dequeue
        queue.displayQueue();
    }
}
