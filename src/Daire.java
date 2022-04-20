public class Daire {
    public double yaricap;

    public Daire(double yaricap) {
        if (yaricap <0) {
            yaricap=0;
        }
        this.yaricap = yaricap ;
    }

    public Daire() {

    }

    public double getYaricap() {
        return yaricap;
    }

    public double setYaricap(double yaricap) {
        this.yaricap = yaricap;

        return yaricap;

    }
    public double getAlan(){
        return (yaricap * yaricap *Math.PI);
    }
}
