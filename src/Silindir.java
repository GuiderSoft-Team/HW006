public class Silindir extends Daire{

    private double yukseklik;

    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);
        if (yukseklik<0) yukseklik=0;
        this.yukseklik = yukseklik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public double getHacim() {
        return super.getAlan()*yukseklik;
    }

    @Override
    public double getAlan() {
        return (2 * Math.pow(getYaricap(),2) * Math.PI + 2*Math.PI * getYaricap() * yukseklik);
    }
}
