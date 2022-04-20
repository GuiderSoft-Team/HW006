public class Daire {

    private double yaricap;

    public Daire(double yaricap) {
        this.setYaricap(yaricap);
    }

    public Daire() {
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        if(yaricap>0){
            this.yaricap = yaricap;
        }
    }


    public double getAlan(){

        return Math.PI*Math.pow(yaricap,2);

    }


}
