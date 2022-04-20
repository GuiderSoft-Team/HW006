package homework006;

public class Daire {
    private double yaricap;

    public Daire(double yaricap) {
        setYaricap(yaricap);
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap < 0 ? 0 : yaricap;
    }

    public double getYaricap() {
        return yaricap;
    }

    public double getAlan() {
        return (yaricap * yaricap * Math.PI);
    }
}