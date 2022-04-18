public class Daire {

    private double yariCap;
    private double alan;


    public Daire(double yariCap) {
        this.yariCap = yariCap;
    }

    public Daire() {

    }

    public double getAlan() {
        alan=yariCap*yariCap*Math.PI;
                return alan;
    }




    public double setAlan() {
        if(yariCap<0){
            alan=0;
        }
        return alan;
    }



    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;


    }



}
