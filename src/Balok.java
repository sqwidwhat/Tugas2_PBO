public class Balok {
    private double p, l, t;

    // Constructor
    public Balok(double p, double l, double t) {
        setP(p);
        setL(l);
        setT(t);
    }

    // Nomor 1
    public void hitungLuasAlas() {
        double luasAlas = p * l;
        System.out.println("Luas Alas Balok : " + luasAlas);
    }

    // Nomor 2
    public void hitungLuasPermukaan() {
        double luasPermukaan = 2 * (p * l + l * t + t * p);
        System.out.println("Luas Permukaan Balok: " + luasPermukaan);
    }

    // Nomor3
    public void setP(double p) {
        this.p = (p > 0) ? p : 1;
    }

    public void setL(double l) {
        this.l = (l > 0) ? l : 1;
    }

    public void setT(double t) {
        this.t = (t > 0) ? t : 1;
    }

    // Getter
    public double getP() {
        return p;
    }

    public double getL() {
        return l;
    }

    public double getT() {
        return t;
    }

    // Nomor 4
    public Balok(double sisi) {
        setP(sisi);
        setL(sisi);
        setT(sisi);
    }
    public void hitungVolume() {
        double volume = p * l * t;
        System.out.println("Volume Balok/Kubus: " + volume);
    }
}
