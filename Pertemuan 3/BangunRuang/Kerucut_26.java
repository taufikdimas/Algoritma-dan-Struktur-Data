package BangunRuang;

public class Kerucut_26 {
    public double jariJari;
    public double sisiMiring;

    public Kerucut_26(double jariJari, double sisiMiring) {
        this.jariJari = jariJari;
        this.sisiMiring = sisiMiring;
    }

    public double LuasPermukaan() {
        return Math.PI * jariJari * (jariJari + sisiMiring);
    }

    public double Volume() {
        return (Math.PI * jariJari * jariJari * sisiMiring) / 3;
    }
}
