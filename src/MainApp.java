public class MainApp {
    public static void main(String[] args) {
        System.out.println("Daire...");
        Daire daire=new Daire(3.75);
        System.out.println("Yarıçap= " +daire.getYariCap());
        System.out.printf("Alan=%5.2f " ,daire.getAlan());
        System.out.println("\n");



        System.out.println("Silindir...");

        Silindir silindir = new Silindir(5.55,7.25);
        System.out.println("Yarıçap= " + silindir.getYariCap());
        System.out.println("Yükseklik= " + silindir.getYukseklik());
        System.out.printf("Alan=%5.2f\n ", silindir.getAlan());
        System.out.printf("Hacim=%5.2f ", silindir.getHacim());




    }
}
