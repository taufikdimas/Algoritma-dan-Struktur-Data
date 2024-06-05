package Graph;

public class GraphMatriks26 {
    int vertex;
    int[][] matriks;

    public GraphMatriks26(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + " : ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " ( " + matriks[i][j] + " m),");
                }
            }
            System.out.println();
        }
    }

    public void degree() {
        for (int v = 0; v < vertex; v++) {
            int totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                if (matriks[i][v] != 0) {
                    totalIn++;
                }
                if (matriks[v][i] != 0) {
                    totalOut++;
                }
            }
            System.out.println("InDegree dari Gedung " + (char) ('A' + v) + " = " + totalIn);
            System.out.println("OutDegree dari Gedung " + (char) ('A' + v) + " = " + totalOut);
            System.out.println("Degree dari Gedung " + (char) ('A' + v) + " = " + (totalIn + totalOut));
            System.out.println();
        }
    }

}
