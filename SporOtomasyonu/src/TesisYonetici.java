import java.io.IOException;
import java.util.Scanner;

public class TesisYonetici {
    Scanner scan = new Scanner(System.in);
    HalıSaha saha = new HalıSaha();
    Depo depo = new Depo();
    Market market = new Market();


        Scanner scanner = new Scanner(System.in);


        public void start() throws IOException, IOException {
            EkranaYaz("SPOR TESİSİMİZE HOŞGELDİNİZ", true);
            EkranaYaz("GİRİŞ YAPMAK İSTEDİĞİNİZ BÖLÜMÜ SEÇİNİZ:", true);
            System.out.println("========================================");
            EkranaYaz("1-PERSONEL YÖNETİM \n" +
                    "2-HALISAHA\n" +
                    "3-DEPO\n" +
                    "4-MARKET\n" +
                    "5-ÇIKIŞ", true);

            while (true) {
                System.out.print("SEÇİMİNİZ:");
                int secim = scan.nextInt();
                switch (secim) {
                    case 1:

                        break;
                    //fonksiyon yaz
                    case 2:
                        saha.SahaBilgi();
                        break;
                    case 3:
                        depo.DepoEkrani();
                        break;
                    case 4:
                        market.Satis();
                        break;

                }

            }

        }


        public void EkranaYaz(String message, boolean satir) {
            if (satir == true)
                System.out.println(message);
            else
                System.out.println(message);
        }


}
