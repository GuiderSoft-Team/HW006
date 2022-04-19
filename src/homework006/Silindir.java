package homework006;

public class Silindir extends Daire {
    private double yukseklik;

    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);
        this.yukseklik = yukseklik < 0 ? 0 : yukseklik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public double getHacim() {
        return super.getAlan() * yukseklik;
    }

    @Override
    public double getAlan() {
        return (2 * getYaricap() * getYaricap() * Math.PI) + (2 * Math.PI * getYaricap() * yukseklik);
    }
}