public class MainApp {
    public static void main(String[] args) {

        System.out.println("DAİRE:");
        Daire daire=new Daire(3.75);
        System.out.println("Yarıçap= "+daire.getYaricap());
        System.out.println("Alan= "+daire.alan());

        System.out.println(".........................");

        System.out.println("SİLİNDİR: ");

        Silindir silindir=new Silindir(5.55,7.25);

        System.out.println("Yarıçap="+ silindir.getYaricap());
        System.out.println("Yükseklik= "+silindir.getYukseklik());
        System.out.println("Alan= "+silindir.alan());
        System.out.println("Hacim="+silindir.hacim());

    }
}
