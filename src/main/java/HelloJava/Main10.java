package HelloJava;

public class Main10 {
    public static void main(String[] args) {
        String ogrencil = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";
        System.out.println(ogrencil);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";

        System.out.println("--------------------------------");

        String[] ogrencielr = new String[4];
        ogrencielr[0] = "Hasan";
        ogrencielr[1] = "Ahmet";
        ogrencielr[2] = "Emre";
        ogrencielr[3] = "Umit";

        for (int i = 0;i < ogrencielr.length;i++)
        {
            System.out.println(ogrencielr[i]);
        }
        for (String ogrenci : ogrencielr) {
            System.out.println(ogrenci);
        }
    }
}

