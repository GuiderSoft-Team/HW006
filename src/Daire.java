public class Daire {
    private double yaricap;

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap < 0 ? 0 : yaricap;
    }

    public Daire() {

    }

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    public double getAlan() {
        return yaricap * yaricap * Math.PI;
    }

}
