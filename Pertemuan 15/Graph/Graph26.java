package Graph;

public class Graph26 {
    int vertex;
    DoubleLinkedList26 list[];

    public Graph26(int v) {
        this.vertex = v;
        list = new DoubleLinkedList26[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList26();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addLast(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
        }
        totalOut = list[asal].size();
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + " = " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + " = " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + " = " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        list[asal].remove(tujuan);
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan : ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].gerJarak(j) + " m), ");
                }
                System.out.println();
            }
        }
    }

    public boolean isTetangga(int asal, int tujuan) throws Exception {
        return isTetanggaDekat(asal, tujuan) || isTetanggaDekat(tujuan, asal);
    }

    private boolean isTetanggaDekat(int asal, int tujuan) throws Exception {
        if (asal >= 0 && asal < vertex && list[asal].size() > 0) {
            for (int i = 0; i < list[asal].size(); i++) {
                int nextNode = list[asal].get(i);
                if (nextNode == tujuan) {
                    return true;
                }
            }
        }
        return false;
    }

    public void updateJarak(int asal, int tujuan, int jarak) throws Exception {
        Node26 current = list[asal].head;
        while (current != null) {
            if (current.data == tujuan) {
                current.jarak = jarak;
                break;
            }
            current = current.next;
        }
    }

    public int hitungEdge() {
        int count = 0;
        for (int i = 0; i < vertex; i++) {
            count += list[i].size();
        }
        return count;
    }
}
