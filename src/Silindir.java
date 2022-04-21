public class Silindir extends Daire{
 private double yukseklik;

    public Silindir(double yukseklik) {
        this.yukseklik = yukseklik;
    }

    public Silindir() {
    }

    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);
        this.yukseklik = yukseklik;


    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik <0 ? 0: yukseklik;
    }
    public double hacim(){
        return super.alan()*getYukseklik();
    }

    @Override
    public double alan() {
        return ((2 * getYaricap() * getYaricap() * Math.PI + 2 * Math.PI * getYaricap() * yukseklik));
    }
}
