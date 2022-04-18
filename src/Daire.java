public class Daire {
    private double yaricap;

    public double getYaricap() {
        return yaricap;
    }
    public Daire(double yaricap, double yukseklik) {
        setYaricap(yaricap);
        // silindir.setYukseklik(yukseklik);  TODO:
    }
    public void setYaricap(double yaricap) {
        this.yaricap = yaricap < 0 ? 0 : yaricap;
    }

    public Daire() {

    }

    public Daire(double yaricap) {
       setYaricap(yaricap);
    }

    public double getAlan() {
        return yaricap * yaricap * Math.PI;
    }

}
