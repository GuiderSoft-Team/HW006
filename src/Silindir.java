public class Silindir  extends Daire {
    private double yukseklik;

    public Silindir(double r,double yukseklik) {
        super(r);
        this.yukseklik=yukseklik <= 0 ? 0 : yukseklik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public double getHacim(){
        return super.getAlan()*yukseklik;
    }

    @Override
    public double getAlan() {
        return (2*getR()*getR()*Math.PI) + (2* Math.PI*getR()*yukseklik);
    }
}

