public class Daire {
    private double yarıÇap;

    public double getalan (){
        return yarıÇap*yarıÇap*Math.PI;
    }
    public double getYarıÇap() {
        return yarıÇap;
    }

    public void setYarıÇap(double yarıÇap) {
        if (yarıÇap<0){
            yarıÇap=0;
        }
        this.yarıÇap = yarıÇap;
    }

    public Daire(double yarıÇap) {
        setYarıÇap(yarıÇap);
    }
    public void showInfo(){


        System.out.println();
        System.out.println("Daire...");

        System.out.printf("Yarıçap=%.2f\n",getYarıÇap());
        System.out.printf("Alan= %.2f\n",getalan());
        System.out.println("");
    }
}

