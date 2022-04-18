package homework6;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Daire...");
        Daire daire = new Daire(3.75);
        System.out.println("Yarıçap= " +daire.getYariCap());
        System.out.println(String.format("Alan=%5.2f ",daire.alan()));
        System.out.println("");
        System.out.println("Silindir...");
        Silindir silindir = new Silindir(5.55, 7.25);
        System.out.println("Yarıçap= " + silindir.getYariCap());
        System.out.println("Yükseklik= " + silindir.getYukseklik());
        System.out.println(String.format("Alan=%5.2f " , silindir.getAlan()));
        System.out.println(String.format("Hacim=%6.2f " , silindir.getHacim()));


    }
}
