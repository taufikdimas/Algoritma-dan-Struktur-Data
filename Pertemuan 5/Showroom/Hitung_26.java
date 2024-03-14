package Showroom;

public class Hitung_26 {
    public int tertinggiDC(Class_26[] mobil, int l, int r) {
        if (l == r) {
            return mobil[l].top_acceleration;
        } else {
            int mid = (l + r) / 2;
            int leftMax = tertinggiDC(mobil, l, mid);
            int rightMax = tertinggiDC(mobil, mid + 1, r);
            return Math.max(leftMax, rightMax);
        }
    }

    public int terendahDC(Class_26[] mobil, int l, int r) {
        if (l == r) {
            return mobil[l].top_acceleration;
        } else {
            int mid = (l + r) / 2;
            int leftMin = terendahDC(mobil, l, mid);
            int rightMin = terendahDC(mobil, mid + 1, r);
            return Math.min(leftMin, rightMin);
        }
    }

    public double rataRataBF(Class_26[] mobil) {
        int totalPower = 0;
        for (int i = 0; i < mobil.length; i++) {
            totalPower += mobil[i].top_power;
        }
        return (double) totalPower / mobil.length;
    }
}
