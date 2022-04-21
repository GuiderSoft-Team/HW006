public class Daire {
    private double yaricap;

    public Daire(double yaricap) {
        this.yaricap = yaricap<0.0?0.0:yaricap;
    }
    public Daire() {


    }
    public double getYaricap() {
        return yaricap;
    }
    public void setYaricap(double yaricap) {
        this.yaricap = yaricap<0.0?0.0:yaricap;
    }


    public double getAlan(){
        return (Math.pow(yaricap,2)*Math.PI);
    }
}
