import java.util.Scanner;
public class UcakBileti {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        //Değişkenler

        int kilometre, yas, yolculukTuru;
        double normalTutar, indirimliTutar, yasIndirimi = 0, gidisDonusIndirimi = 0, toplamTutar;
        boolean veriKontrolu=true;

        //Kullanıcıdan kilometre, yaş ve yolculuk türü bilgilerinin alınması
        System.out.println("Kilometre bilgisini yazınız.");
        kilometre = scan.nextInt();
        System.out.println("Yolcu yaşını yazınız.");
        yas = scan.nextInt();
        System.out.println("Yolculuk türü: 1- Gidiş-dönüş, 2- Tek yön");
        yolculukTuru = scan.nextInt();


        if (kilometre<=0 || yas<=0 || !(yolculukTuru ==1 || yolculukTuru==2)) {
            veriKontrolu = false;
            System.out.println("Hatalı veri girişi");
        }

        if (veriKontrolu==true) {

            normalTutar = kilometre * 0.1;

            if (yas < 12) {
                yasIndirimi = normalTutar * 0.5;
                indirimliTutar = normalTutar - yasIndirimi;

            } else if (yas >= 12 && yas < 24) {
                yasIndirimi = normalTutar * 0.1;
                indirimliTutar = normalTutar - yasIndirimi;
            } else if (yas > 65) {
                yasIndirimi = normalTutar * 0.3;
                indirimliTutar = normalTutar - yasIndirimi;
            } else {
                indirimliTutar = normalTutar;
            }


            if (yolculukTuru == 1) {
                gidisDonusIndirimi = indirimliTutar * 0.2;
                toplamTutar = 2 * (indirimliTutar - gidisDonusIndirimi);
            } else {
                toplamTutar = indirimliTutar;
            }


            System.out.println("Toplam Tutar:" + toplamTutar);

        }
    }
}