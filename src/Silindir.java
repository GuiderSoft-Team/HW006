public class Silindir extends Daire {

    private double yukseklik;

    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);

        this.setYukseklik(yukseklik);
    }

    public Silindir() {
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if(yukseklik>0){
            this.yukseklik = yukseklik;
        }

    }
    public double getHacim(){

        return Math.PI*Math.pow(getYaricap(),2)*yukseklik;
    }

    @Override
    public double getAlan() {
        return Math.PI*Math.pow(getYaricap(),2)+2*Math.PI*yukseklik;
    }


}
