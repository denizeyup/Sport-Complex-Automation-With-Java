import java.util.Scanner;

public class Yonetici {
    Scanner scanner = new Scanner(System.in);

    private Calisanlar calisanlar;

    Yonetici(Calisanlar calisanlar) {


        this.calisanlar = calisanlar;
    }

    Yonetici() {

    }

    public void Bilgiler() {
        calisanlar.BilgiGoster("Nuri", "AKAT", 7500);

    }

    public void Zamlar() {
        calisanlar.ZamYap("Ersel", "KAYA", 9500);
    }

    public void EkleCikar() {
        calisanlar.PersonelEkle("EYÜP", "DENİZ", 5000);

    }

    public void DepoMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("< Gerçekleştirilecek İşlemler >\n-----------------\n[1] - Bilgi Göster \n[2] - Zam Yap \n[3] - Personel Ekle \nKararınız:");

        while (true) {
            System.out.println("SEÇİMİNİZ: ");
            int kararVer = scanner.nextInt();
            switch (kararVer) {
                case 1:
                    System.out.println("-----------------");
                    Bilgiler();
                    System.out.println("-----------------");
                    break;
                case 2:
                    System.out.println("-----------------");
                    Zamlar();
                    break;
                case 3:
                    System.out.println("-----------------");
                    EkleCikar();
                    break;
                default:
                    System.out.println("-----------------\n-> Tanımsız Bir Değer Girdiniz.\n-----------------");
                    break;
            }
        }
    }
}