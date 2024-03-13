package Showroom;

public class Main_26 {
    public static void main(String[] args) {
        Class_26[] mobil = {
                new Class_26("BMW", "M2 Coupe", 2016, 6816, 728),
                new Class_26("Ford", "Fiesta ST", 2014, 3921, 575),
                new Class_26("Nissan", "370Z", 2009, 4360, 657),
                new Class_26("Subaru", "BRZ", 2014, 4058, 609),
                new Class_26("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new Class_26("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new Class_26("Toyota", "86/GT86", 2014, 4180, 609),
                new Class_26("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        Hitung_26 analisis = new Hitung_26();

        // a) top_acceleration tertinggi menggunakan Divide and Conquer
        int topAcceleration = analisis.tertinggiDC(mobil, 0, mobil.length - 1);
        System.out.println("Top acceleration tertinggi: " + topAcceleration);

        // b) top_acceleration terendah menggunakan Divide and Conquer
        int lowAcceleration = analisis.terendahDC(mobil, 0, mobil.length - 1);
        System.out.println("Top acceleration terendah: " + lowAcceleration);

        // c) Rata-rata top_power dari seluruh mobil menggunakan Brute Force
        double averagePower = analisis.rataRataBF(mobil);
        System.out.println("Rata-rata top power: " + averagePower);
    }
}
