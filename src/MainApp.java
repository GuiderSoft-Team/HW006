public class MainApp {
    public static void main(String[] args) {

        System.out.println("Daire...");

        Daire daire = new Daire(3.75);

        System.out.printf("Yarıçap= %.2f\n", daire.getYaricap());
        System.out.printf("Alan= %.2f\n", daire.getAlan());

        System.out.println("\nSilindir...");

        Silindir silindir = new Silindir(5.55, 7.25);

        System.out.printf("Yarıçap= %.2f\n", silindir.getYaricap());
        System.out.printf("Yükseklik= %.2f\n", silindir.getYukseklik());
        System.out.printf("Alan= %.2f\n", silindir.getAlan());
        System.out.printf("Hacim= %.2f\n", silindir.getHacim());

    }
}