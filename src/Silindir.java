public class Silindir extends Daire {
    private double yukseklik;

    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);
        this.yukseklik = yukseklik <= 0 ? 0 : yukseklik;;
    }



    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
        if(yukseklik<0){
            yukseklik=0;
        }
    }
    public double hacimHesapla(){
        return super.getAlan()*yukseklik ;
    }

    @Override
    public double getAlan() {
        return(2 * yaricap * yaricap * Math.PI + 2 * Math.PI * yaricap * yukseklik);
    }



}