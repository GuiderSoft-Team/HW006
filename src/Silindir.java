public class Silindir extends Daire{

    private double yukseklik;

    public Silindir(double yariCap, double yukseklik) {
        super(yariCap);
        this.yukseklik = yukseklik;
    }

    public Silindir(double yariCap) {
        super(yariCap);
    }

    public double getYukseklik() {
        if (yukseklik<0){
            return 0;
        }
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }
    public double getHacim(){
        return getYariCap()*getYariCap()*Math.PI*yukseklik;
    }

    @Override
    public double getAlan(){
        return 2 * getYariCap() * getYariCap() * Math.PI + 2 * Math.PI *
                getYariCap() * yukseklik;
    }
}





