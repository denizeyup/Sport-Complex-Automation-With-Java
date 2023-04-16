import java.util.Scanner;

public class DepoCalisani implements Calisanlar{
    int eski_maas;


    Scanner scan=new Scanner(System.in);

    public DepoCalisani(String nuri, String akat, int i) {

        super();
    }

    @Override
    public void BilgiGoster(String ad, String soyad, int maas) {

        System.out.println("Sistemimizde Kayıtlı Çalışanlar:");
        System.out.println("ADI:"+ad+ "\n"+"Soyadı: "+soyad+"\n"+"MAAŞI:"+maas);

    }



    @Override
    public void ZamYap(String ad,String soyad,int maas) {
        eski_maas=maas;
        System.out.println("Çalışana Zam Yapma Bölümüne Hoşgeldiniz...");
        System.out.print("Yapmak İstediğiniz Zam Oranını Giriniz:");
        int zamOrani=scan.nextInt();
        System.out.println(ad+" "+soyad+" "+"İsimli Çalışana %" + zamOrani + " oranda zam yapıldı.");
        maas+=(maas*zamOrani)/100;

        System.out.println("Eski Maaş: "+eski_maas+ " "+" Yeni Maaş:"+ maas);

    }

    @Override
    public void PersonelEkle(String ad,String soyad,int maas) {

        System.out.println("Personel Ekleme Ekranına Hoşgeldiniz");
        //VERİ TABANI KULLANILACAK
    }


}
