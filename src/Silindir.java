public class Silindir extends Daire {

    private double yukseklik;

    public Silindir(double yaricap, double yukseklik) {
        super(yaricap,yukseklik);
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik < 0 ? 0 : yukseklik;
    }

    public Silindir() {

    }

    public Silindir(double yukseklik) {
    }

    public double getHacim() {
        return super.getAlan() * getYukseklik();
    }

    @Override
    public double getAlan() {
        return (2 * Math.pow(getYaricap(), 2) * Math.PI) + (2 * Math.PI * getYaricap() * yukseklik);
    }
}


