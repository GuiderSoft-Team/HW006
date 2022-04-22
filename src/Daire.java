public class Daire {

    private double yariCap;


    public Daire(double yariCap) {
        this.yariCap = yariCap;
    }

    public Daire() {

    }



    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        if(yariCap<0){
            yariCap=0;
        }
        this.yariCap = yariCap;


    }
    public double getAlan(){
        return yariCap*yariCap*Math.PI;
    }



}
