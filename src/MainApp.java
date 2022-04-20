public class MainApp {
    public static void main(String[] args) {

        System.out.println("Daire Hesapları.");
        Daire daire=new Daire(3.75);
        System.out.println("Dairenin Yarı Çapı...="+daire.getYariCap());
        System.out.printf("Dairenin Alanı%5.2f \n",daire.getAlan());
        System.out.println();


        System.out.println("Silindir Hesapları...");
        Silindir silindir=new Silindir(5.55,7.25);
        System.out.println("Silindir Yarıcap   ="+silindir.getYariCap());
        System.out.println("Silindir Yükseklik ="+silindir.getYukseklik());
        System.out.printf("Silidir Alanı   :%5.2f  \n"   ,silindir.getAlan());
        System.out.printf("Silindir Hacmi  :%5.2f "    ,silindir.getHacim());

    }
}

