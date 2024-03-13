package minggu5;

public class Faktorial_26 {

    public int nilai;

    // int faktorialBF(int n) {
    // int fakto = 1;
    // for (int i = 1; i <= n; i++) {
    // fakto = fakto * i;// i bukan 1
    // }
    // return fakto;
    // }
    int faktorialBF(int n) {// pertanyaan no 2 percobaan 1
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto = fakto * i;
            i++;
        }
        return fakto;
    }

    int faktorialDC(int n) {
        if (n == 0 || n == 1) {// perbaikan
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}
