package HelloJava;

public class Main5 {
    public static void main(String[] args) {
        int sayil = 24;
        int sayi2 = 25;
        int sayi3 = 2;
        int enBuyuk = sayil;
        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("En büyük = " + enBuyuk);
    }
}
