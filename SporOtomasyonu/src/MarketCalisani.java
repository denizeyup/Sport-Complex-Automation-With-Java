import java.util.Scanner;

public class MarketCalisani implements Calisanlar{

    int eskimaas;
    Scanner scanner=new Scanner(System.in);

    public MarketCalisani(String ad,String soyad,int maas) {
    }

    @Override
    public void BilgiGoster(String ad, String soyad, int maas) {
        System.out.println("Market Çalışanları Bölümüne Hoşgeldiniz...");
        System.out.println("Depo Çalışanları Bölümüne Hoşgeldiniz...");
        System.out.println("Sistemimizde Kayıtlı Çalışanlar:");

    }

    @Override
    public void ZamYap(String ad, String soyad, int maas) {
        eskimaas=maas;
        System.out.println("Market Çalışanı Zam Yapma Ekranına Hoşgeldiniz");
        System.out.println("Bir Market Çalışanına % 20 den fazla zam yapamazsınız.\n" +
                "Yapmak İstediğiniz Zam Oranını Giriniz: ");
        int girdi= scanner.nextInt();
        if (girdi<0&&girdi>20){
            System.out.print("İşletme Kurallarına Aykırı Bir Zam Oranı Girdiniz Lütfen Yeniden Giriş Yapınız:");
            girdi= scanner.nextInt();
        }
        maas+=(maas*girdi)/100;
        System.out.println(ad+" "+soyad+" "+"İsimli Çalışana %" + girdi + " oranda zam yapıldı.");

    }

    @Override
    public void PersonelEkle(String ad, String soyad, int maas) {
        //veritabanı

    }
}
