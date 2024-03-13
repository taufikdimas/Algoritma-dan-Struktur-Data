package Showroom;

public class Hitung_26 {
    public int tertinggiDC(Class_26[] cars, int l, int r) {
        if (l == r) {
            return cars[l].top_acceleration;
        } else {
            int mid = (l + r) / 2;
            int leftMax = tertinggiDC(cars, l, mid);
            int rightMax = tertinggiDC(cars, mid + 1, r);
            return Math.max(leftMax, rightMax);
        }
    }

    public int terendahDC(Class_26[] cars, int l, int r) {
        if (l == r) {
            return cars[l].top_acceleration;
        } else {
            int mid = (l + r) / 2;
            int leftMin = terendahDC(cars, l, mid);
            int rightMin = terendahDC(cars, mid + 1, r);
            return Math.min(leftMin, rightMin);
        }
    }

    public double rataRataBF(Class_26[] cars) {
        int totalPower = 0;
        for (int i = 0; i < cars.length; i++) {
            totalPower += cars[i].top_power;
        }
        return (double) totalPower / cars.length;
    }
}
