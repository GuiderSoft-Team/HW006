public class Silindir extends Daire{
    private double yukseklik;

    public Silindir(double yaricap ,double yukseklik) {
        super(yaricap);
        setYukseklik(yukseklik);
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if(yukseklik<0){
            yukseklik=0;
        }
        this.yukseklik = yukseklik;
    }

    public double getAlan() {
        return (2*getYarıÇap()*getYarıÇap()*Math.PI)+(2*Math.PI*getYarıÇap()*yukseklik);
    }

    public double getHacim(){
        return super.getalan()*yukseklik;
    }

    public void showInfo(){

        System.out.println("Silindir...");
        System.out.printf("Yarıçap=%.2f\n",getYarıÇap());
        System.out.printf("Yükseklik=%.2f\n", getYukseklik());
        System.out.printf("Alan=%.2f\n" , getAlan());
        System.out.printf("Hacim=%.2f", getHacim());

    }
}

