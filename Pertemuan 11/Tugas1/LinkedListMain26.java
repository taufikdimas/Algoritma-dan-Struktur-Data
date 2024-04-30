package Tugas1;

public class LinkedListMain26 {
    public static void main(String[] args) {
        LinkedList26 singLL = new LinkedList26();

        singLL.print();
        singLL.addFirst(new Mahasiswa26(111, "Anton"));
        singLL.print();
        singLL.addLast(new Mahasiswa26(112, "Prita"));
        singLL.print();
        singLL.insertAfter(112, new Mahasiswa26(113, "Yusuf"));
        singLL.print();
        singLL.insertAfter(113, new Mahasiswa26(114, "Doni"));
        singLL.print();
        singLL.insertAt(4, new Mahasiswa26(115, "Sari"));
        singLL.print();

    }
}
