package BangunRuang;

public class limasSegiEmpat_26 {
    double panjangSisiAlas;
    double tinggiLimas;

    public limasSegiEmpat_26(double panjangSisiAlas, double tinggiLimas) {
        this.panjangSisiAlas = panjangSisiAlas;
        this.tinggiLimas = tinggiLimas;
    }

    double hitungLuasPermukaan() {
        return panjangSisiAlas * panjangSisiAlas + 4 * (0.5 * panjangSisiAlas * tinggiLimas);
    }

    double hitungVolume() {
        return (panjangSisiAlas * panjangSisiAlas * tinggiLimas) / 3;
    }
}
