package BangunRuang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Kerucut
        System.out.print("Masukkan jari-jari kerucut: ");
        double jariJari = sc.nextDouble();
        System.out.print("Masukkan sisi miring kerucut: ");
        double sisiMiring = sc.nextDouble();

        Kerucut_26 kerucut = new Kerucut_26(jariJari, sisiMiring);

        // Input Limas Segi Empat
        System.out.print("Masukkan panjang sisi alas limas segi empat: ");
        double panjangSisiAlas = sc.nextDouble();
        System.out.print("Masukkan tinggi limas segi empat: ");
        double tinggiLimas = sc.nextDouble();

        limasSegiEmpat_26 limas = new limasSegiEmpat_26(panjangSisiAlas, tinggiLimas);

        // Input Bola
        System.out.print("Masukkan jari-jari bola: ");
        double jariJariB = sc.nextDouble();

        Bola_26 bola = new Bola_26(jariJariB);

        // hasil perhitungan
        System.out.println("Luas Permukaan dan Volume Kerucut:");
        System.out.println("Luas Permukaan: " + Math.round(kerucut.LuasPermukaan()));
        System.out.println("Volume: " + Math.round(kerucut.Volume()));

        System.out.println("\nLuas Permukaan dan Volume Limas Segi Empat:");
        System.out.println("Luas Permukaan: " + Math.round(limas.hitungLuasPermukaan()));
        System.out.println("Volume: " + Math.round(limas.hitungVolume()));

        System.out.println("\nLuas Permukaan dan Volume Bola:");
        System.out.println("Luas Permukaan: " + Math.round(bola.hitungLuasPermukaan()));
        System.out.println("Volume: " + Math.round(bola.hitungVolume()));

        sc.close();
    }
}
