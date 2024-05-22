// Taufik Dimas | 2341720062 | 26 | TI - 1B
package Kuis2;

class MotoGP {
    Node26 head;
    Node26 tail;
    static String[] pembalapList = { "Marc Marquez", "Taufik Dimas", "Valentino Rossi", "Mike Tyson",
            "Erling Haaland", "Dani Pedrosa", "Johann Zarco", "Conor McGregor", "Khalid bin Walid", "Kobe Bryant" };

    MotoGP() {
        this.head = null;
        this.tail = null;
    }

    void accPembalap(Pembalap pembalap) {
        Node26 newNode = new Node26(pembalap);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        urutKlasemen();
    }

    void tambahPertandingan(int[] posisiPembalap) {
        Node26 current = head;
        while (current != null) {
            int point = getPoint(posisiPembalap, current.pembalap.nama);
            current.pembalap.totalPoint += point;
            current.pembalap.addPoint(point);
            current = current.next;
        }
        urutKlasemen();
    }

    void urutKlasemen() {
        Node26 current = head;
        while (current != null) {
            Node26 nextNode = current.next;
            while (nextNode != null) {
                if (current.pembalap.totalPoint < nextNode.pembalap.totalPoint) {
                    Pembalap temp = current.pembalap;
                    current.pembalap = nextNode.pembalap;
                    nextNode.pembalap = temp;
                }
                nextNode = nextNode.next;
            }
            current = current.next;
        }
    }

    void tampilkanKlasemen() {
        System.out.println(
                "===========================================================================================================================================");
        System.out.printf("| %-20s | %-12s |", "Nama Pembalap", "Total Point");
        for (int i = 1; i <= 20; i++) {
            System.out.printf(" %02d |", i);
        }
        System.out.println(
                "\n===========================================================================================================================================");

        Node26 current = head;
        while (current != null) {
            System.out.printf("| %-20s | %-12d |", current.pembalap.nama, current.pembalap.totalPoint);
            PointNode pointCurrent = current.pembalap.headPoint;
            int raceCount = 0;
            while (pointCurrent != null) {
                System.out.printf(" %02d |", pointCurrent.point);
                pointCurrent = pointCurrent.next;
                raceCount++;
            }
            for (int i = raceCount + 1; i <= 20; i++) {
                System.out.print("    |");
            }
            current = current.next;
            System.out.println(
                    "\n-------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    int getPoint(int[] posisiPembalap, String nama) {
        for (int i = 0; i < posisiPembalap.length; i++) {
            if (MotoGP.pembalapList[i].equals(nama)) {
                switch (posisiPembalap[i]) {
                    case 1:
                        return 25;
                    case 2:
                        return 20;
                    case 3:
                        return 16;
                    case 4:
                        return 13;
                    case 5:
                        return 11;
                    case 6:
                        return 10;
                    case 7:
                        return 9;
                    case 8:
                        return 8;
                    case 9:
                        return 7;
                    case 10:
                        return 6;
                    case 11:
                        return 5;
                    case 12:
                        return 4;
                    case 13:
                        return 3;
                    case 14:
                        return 2;
                    case 15:
                        return 1;
                    default:
                        return 0;
                }
            }
        }
        return 0;
    }
}
