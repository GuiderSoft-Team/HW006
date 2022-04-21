public class Silindir extends Daire{
    private double yukseklik;

    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);
        this.yukseklik = yukseklik<0.0?0.0:yukseklik;
    }
    public Silindir(){}

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik<0.0?0.0:yukseklik;
    }

    public double getHacim(){
        return yukseklik*super.getAlan();
    }

    @Override
    public double getAlan() {
       return 2*Math.pow(getYaricap(),2)*Math.PI+2*Math.PI*getYaricap()*yukseklik;
               //(2 * yaricap * yaricap * PI + 2 * PI * yaricap * yukseklik)
    }
}
