public class Silindir extends Daire{
    private double yukseklik;

    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);
        if(yukseklik<=0){this.yukseklik=0;}else{
        this.yukseklik = yukseklik;}
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public double getHacim(){
        return super.getAlan()*getYukseklik();
    }

    @Override
    public double getAlan() {
        return (2*getYaricap()*getYaricap()*Math.PI+2*Math.PI*getYaricap()*yukseklik);
    }
}

