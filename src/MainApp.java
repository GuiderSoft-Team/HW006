public class MainApp {
    public static void main(String[] args) {


        System.out.println("Daire...");
        Daire daire=new Daire(3);

        System.out.println("Yarıçap="+daire.getYaricap());
        System.out.println("Alan="+daire.getAlan());
        System.out.println("");
        System.out.println("Silindir...");
        Silindir silindir=new Silindir(5,7);
        System.out.println("Yarıçap="+silindir.getYaricap());
        System.out.println("yükseklik="+silindir.getYukseklik());
        System.out.println("Alan="+silindir.getAlan());
        System.out.println("Hacim="+silindir.getHacim());


    }
}
