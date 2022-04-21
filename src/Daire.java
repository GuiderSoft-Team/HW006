public class Daire {
    private double yaricap;



    public Daire(double yaricap) {

        this.yaricap = yaricap <= 0 ? 0 : yaricap;}

        public double getYaricap() {
            return yaricap;
        }


    public double getAlan(){
        return Math.PI*yaricap*yaricap;
    }
}
