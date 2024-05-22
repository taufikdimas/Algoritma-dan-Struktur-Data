// Taufik Dimas | 2341720062 | 26 | TI - 1B
package Kuis2;

class Node26 { // untuk pembalap
    Pembalap pembalap;
    Node26 next;
    Node26 prev;

    Node26(Pembalap pembalap) {
        this.pembalap = pembalap;
        this.next = null;
        this.prev = null;
    }
}

class PointNode {// untuk point per - pertandingan
    int point;
    PointNode next;
    PointNode prev;

    PointNode(int point) {
        this.point = point;
        this.next = null;
        this.prev = null;
    }
}

class Pembalap {
    String nama;
    int totalPoint;
    PointNode headPoint;
    PointNode tailPoint;

    Pembalap(String nama) {
        this.nama = nama;
        this.totalPoint = 0;
        this.headPoint = null;
        this.tailPoint = null;
    }

    void addPoint(int point) {
        PointNode newNode = new PointNode(point);
        if (headPoint == null) {
            headPoint = newNode;
            tailPoint = newNode;
        } else {
            tailPoint.next = newNode;
            newNode.prev = tailPoint;
            tailPoint = newNode;
        }
    }
}
