package homework6;

public class Daire {
    private double yariCap;

    public Daire() {
    }

    public Daire(double yariCap) {
        this.yariCap = yariCap;
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        if (yariCap>0){
        this.yariCap = yariCap;}
        else {
            yariCap=0;
        }
    }
    public double alan(){
        return (yariCap * yariCap * Math.PI);
    }


}
