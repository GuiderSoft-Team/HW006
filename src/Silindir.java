

public class Silindir extends Daire {

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

    @Override
    public double getAlan() {
        return (2*getYaricap()*getYaricap()*Math.PI)+(2*Math.PI*getYaricap()*yukseklik);
    }

    public double getHacim(){
        return super.getAlan()*yukseklik;
    }

   public void showInfo(){


       Silindir silindir = new Silindir(getYaricap(),getYukseklik());
       System.out.println("Silindir...");
       System.out.printf("Yarıçap=%.2f\n", silindir.getYaricap());
       System.out.printf("Yükseklik=%.2f\n", silindir.getYukseklik());
       System.out.printf("Alan=%.2f\n" , silindir.getAlan());
       System.out.printf("Hacim=%.2f", silindir.getHacim());

   }
}
