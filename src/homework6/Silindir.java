package homework6;

public class Silindir extends Daire {
    private double yukseklik;

    public Silindir() {
    }

    public Silindir(double yariCap,double yukseklik) {
        super(yariCap);
        this.yukseklik = yukseklik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if (yukseklik>0){
            this.yukseklik = yukseklik;}
        else {
            yukseklik=0;
        }

    }
    public double getHacim(){
    return super.alan()*yukseklik;
    }
    public double getAlan(){
        return 2 * getYariCap()* getYariCap()* Math.PI + 2 * Math.PI * getYariCap() * yukseklik;
    }

    @Override
    public double alan() {
        return getAlan();
    }
}
