import java.io.*;
import java.util.Scanner;

public class Depo {
    File dosya=new File("DEPO.txt");
    String addurun;
    Scanner scan=new Scanner(System.in);



    public void DepoEkrani() throws IOException {
        EkranaYaz("Depo Ekranına Hoşgeldiniz Hangi İşlemi Yapmak İstersiniz?\n" +
                "1-ÜRÜN EKLE\n" +
                "2-KAÇ ADET ÜRÜN OLDUĞUNU GÖSTER\n" +
                "3-GERİ DÖN",true);
       while(true) {
           System.out.print("Seçiminiz: ");
           int secim = scan.nextInt();
           switch (secim) {
               case 1:
                   UrunEkle();
                   break;
               case 2:
                   DepoOku();
                   break;
           }
       }
    }

    public void UrunEkle() throws IOException {

       EkranaYaz("",true);
       addurun=scan.nextLine();
        EkranaYaz("Eklemek İstediğiniz Ürünün İsmini ve Adetini Girin:",true);
        addurun=scan.nextLine();
        System.out.println("Ürün Başarılı Bir Şekilde Eklendi!");

        if(!dosya.exists())
            dosya.createNewFile();

        FileWriter yaz=new FileWriter(dosya,true);
        BufferedWriter veriyaz=new BufferedWriter(yaz);

        veriyaz.write(addurun);
        veriyaz.newLine();
        veriyaz.close();
        yaz.close();

    }
    private void DepoOku() throws FileNotFoundException {

        scan=new Scanner(dosya);
        while (scan.hasNextLine()==true){

                EkranaYaz(  "--> "+scan.nextLine(),true);

        }
    }
    public void EkranaYaz(String message, boolean satir) {
        if (satir == true)
            System.out.println(message);
        else
            System.out.println(message);
    }



    }






