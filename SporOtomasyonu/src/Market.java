import java.util.Scanner;

public class Market extends Location{

    Scanner scan=new Scanner(System.in);
    public Market() {
        super();

    }

    @Override
    void Satis() {

        System.out.print("Marketten Almak İstediğiniz Ürünü Yazınız:");
        String st=scan.nextLine();
        System.out.print("Miktarını Giriniz:");
        int miktar= scan.nextInt();
        setFiyat((int) (Math.random()*10));
        System.out.println("Ürünün birim fiyatı: "+ getFiyat());
        System.out.println("Ödeyeceğeniz Tutar: " + getFiyat()*miktar);

    }
}