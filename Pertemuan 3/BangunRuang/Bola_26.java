package BangunRuang;

public class Bola_26 {
    double jariJariB;

    public Bola_26(double jariJari) {
        this.jariJariB = jariJari;
    }

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJariB, 2);
    }

    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJariB, 3);
    }

}
