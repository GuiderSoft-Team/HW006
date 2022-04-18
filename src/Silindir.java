public class Silindir extends Daire{
    private double yukseklik;



    public Silindir(double yariCap, double yukseklik) {
        super(yariCap);
        this.yukseklik = yukseklik<=0?0:yukseklik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;

   }
    public double getHacim(){
        return super.getAlan()*yukseklik;
    }

    @Override
    public double getAlan() {
        return (2*getYariCap()*getYariCap()*Math.PI) + (2* Math.PI*getYariCap()*yukseklik);
    }
}
