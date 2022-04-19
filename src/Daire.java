
public class Daire {

    private double yaricap;


    public Daire(double yaricap) {
        setYaricap(yaricap);
    }



    public void setYaricap(double yaricap) {
        if(yaricap<0){
            yaricap=0;
        }
        this.yaricap=yaricap;

    }

    public double getYaricap() {

        return yaricap;
    }

    public double getAlan(){

        return yaricap*yaricap*Math.PI;
    }

    public void showInfo(){


        System.out.println();
        System.out.println("Daire...");

        System.out.printf("Yarıçap=%.2f\n",getYaricap());
        System.out.printf("Alan= %.2f\n",getAlan());
        System.out.println("");
    }

}
