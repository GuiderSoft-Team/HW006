public class Daire {
    private double yaricap;
    private double alan;

    public Daire() {
    }

    public Daire(double yaricap) {
        if(yaricap<0) yaricap=0;
        this.yaricap = yaricap;
    }

    public double getYaricap() {
        return yaricap;
    }

    public double getAlan() {
        return yaricap*yaricap*Math.PI;
    }
}
