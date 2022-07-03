import java.util.Scanner;
public class Main {
    /**
     * Not Ortalama ve durum bildirimi
     * @author Ibrahim Karhan
     * @since 2022
     */
    public static void main(String[] args) {
      // Desikenler
        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;
        Scanner inp= new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        Matematik=inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        Fizik=inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        Kimya=inp.nextInt();

        int toplam= (Matematik+Fizik+Kimya);
        double ortalama= toplam/3.0;
        System.out.print("Ortalamaniz: " +ortalama);

        boolean sonuc=ortalama>=45; //45 ve üstü ise sınıfını geciyor.

        String str=(sonuc) ? "\nSinifi Gectin, Hayirli olsun.": "\nGecmis olsun sinifta kaldin :(";
        System.out.println(str);

    }
}