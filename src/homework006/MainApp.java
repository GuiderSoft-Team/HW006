package homework006;

public class MainApp {
    public static void main(String[] args) {
        Daire daire = new Daire(3.75);
        System.out.println("Daire objesi oluşturuldu.");
        System.out.println("Yarıçap = " + daire.getYaricap());
        System.out.printf("Alan =%5.2f\n", daire.getAlan());
        System.out.println("--".repeat(15));
        System.out.println("Silindir objesi oluşturuldu.");
        Silindir silindir = new Silindir(5.55, 7.25);
        System.out.println("Yarıçap= " + silindir.getYaricap());
        System.out.printf("Yükseklik =%5.2f\n", silindir.getYukseklik());
        System.out.printf("Alan =%5.2f\n", silindir.getAlan());
        System.out.printf("Hacim =%5.2f", silindir.getHacim());
    }
}
