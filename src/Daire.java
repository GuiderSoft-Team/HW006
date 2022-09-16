public class Daire {

    private double yariCap;

    public Daire(double yariCap) {
        this.yariCap = yariCap;
    }

    public double getYariCap() {
        if (yariCap<0){
            return 0;
        }
        return yariCap;
    }

    public double getAlan(){
        return yariCap*yariCap*Math.PI;
    }
}
