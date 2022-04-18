public class Daire {
    private double r;

    public Daire(double r) {
        this.r = r <= 0 ? 0 : r;
    }

    public double getR() {
        return r;
    }

    public double getAlan() {
        return r * r * Math.PI;
    }}
