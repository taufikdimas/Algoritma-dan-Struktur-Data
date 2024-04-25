package Pratikum2;

public class Nasabah26 {
    String nama, norek, alamat;
    int umur;
    double saldo;

    public Nasabah26() {

    }

    public Nasabah26(String nama, String norek, String alamat, int umur, double saldo) {
        this.nama = nama;
        this.norek = norek;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }

    public static class Queue26 {
        Nasabah26[] data;
        int front;
        int rear;
        int size;
        int max;

        public

        Queue26(int n) {
            max = n;
            data = new Nasabah26[max];
            size = 0;
            front = rear = -1;
        }

        public boolean isEmpty() {
            if (size == 0) {
                return true;
            } else {
                return false;
            }
        }

        public boolean IsFull() {
            if (size == max) {
                return true;
            } else {
                return false;
            }
        }

        public void peek() {
            if (!isEmpty()) {
                System.out.println("Elemen terdepan: " + data[front].norek + "" + data[front].nama + ""
                        + data[front].alamat + "" + data[front].umur + "" + data[front].saldo);
            } else {
                System.out.println("Queue masih kosong");
            }
        }

        public void peekRear() {
            if (!isEmpty()) {
                System.out.println("Elemen paling belakang: " + data[rear].norek + " " + data[rear].nama + " "
                        + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
            } else {
                System.out.println("Queue masih kosong");
            }
        }

        public void print() {
            if (isEmpty()) {
                System.out.println("Queue masih kosong");
            } else {
                int i = front;
                while (i != rear) {
                    System.out.println(data[i].norek + "  " + data[i].nama + "  " + data[i].alamat + "  " + data[i].umur
                            + "  " + data[i].saldo);
                    i = (i + 1) % max;
                }
                System.out.println(
                        data[i].norek + "  " + data[i].nama + "  " + data[i].alamat + "  " + data[i].umur + "  "
                                + data[i].saldo + "  ");
                System.out.println("Jumlah elemen: " + size);
            }
        }

        public void clear() {
            if (!isEmpty()) {
                front = rear = -1;
                size = 0;
                System.out.println("Queue sudah dikosongkan");
            } else {
                System.out.println("Queue masih kosong");
            }
        }

        public void Enqueue(Nasabah26 dt) {
            if (IsFull()) {
                System.out.println("Queue sudah penuh");
                System.exit(0);
            } else {
                if (isEmpty()) {
                    front = rear = 0;
                } else {
                    if (rear == max - 1) {
                        rear = 0;
                    } else {
                        rear++;
                    }
                }
                data[rear] = dt;
                size++;
            }
        }

        public Nasabah26 Dequeue() {
            Nasabah26 dt = new Nasabah26();
            if (isEmpty()) {
                System.out.println("Queue masih kosong");
                System.exit(0);
            } else {
                dt = data[front];
                size--;
                if (isEmpty()) {
                    front = rear = -1;
                } else {
                    if (front == max - 1) {
                        front = 0;
                    } else {
                        front++;
                    }
                }
            }
            return dt;
        }
    }
}
