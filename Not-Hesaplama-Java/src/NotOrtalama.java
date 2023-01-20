import java.sql.PseudoColumnUsage;
import java.util.Scanner;
public class NotOrtalama {
    public static void main(String[] args) {
        //Değişkenleri tanımladık
        int matetmatik,fizik,turkce,tarih,muzik;

        //Scanner sınıfını tanımladık
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        matetmatik=input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik=input.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce=input.nextInt();

        System.out.print("Tarih notunuzu giriniz");
        tarih=input.nextInt();

        System.out.print("Müzik notunuzu giriniz");
        muzik=input.nextInt();

        //Ortalamayı hesaplıyoruz
        int toplam=matetmatik+fizik+turkce+tarih+muzik;
        int ortalama=toplam/5;

        System.out.print("Ortalamanız "+ortalama+" ");

    }
}
