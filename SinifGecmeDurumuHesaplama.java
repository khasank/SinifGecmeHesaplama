import java.util.Scanner;

public class SinifGecmeDurumuHesaplama {
    public static void main(String[] args) {
        // Değişkenleri tanımlıyoruz.
        int mat, fizik, turkce, kimya, muzik;
        int avarageTotal = 0;
        double avarage = 0;


        // Scanner sınıfı değişkenizimi tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan veri girişi yapılıyor.
        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();
        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        // Ortalama Hesaplaması öncesinde notların 0 ile 100 arasında olma kontrolü yapılıyor.
        if (mat >= 0 && mat <= 100) {
            avarage = mat + avarage;
            avarageTotal++;
        }
        if (fizik >= 0 && fizik <= 100) {
            avarage = fizik + avarage;
            avarageTotal++;
        }
        if (turkce >= 0 && turkce <= 100) {
            avarage = turkce + avarage;
            avarageTotal++;
        }
        if (kimya >= 0 && kimya <= 100) {
            avarage = kimya + avarage;
            avarageTotal++;
        }
        if (muzik >= 0 && muzik <= 100) {
            avarage = muzik + avarage;
            avarageTotal++;
        }
        // Ortalama hesaplanıyor ve kullanıcıya kaldı ve geçti mesajı yazılıyor.
        avarage = avarage / avarageTotal;
        System.out.println("Not Ortalamanız : " + avarage);
        if (avarage >= 55) {
            System.out.println("Tebrikler sınıfı geçtiniz.");
        } else System.out.println("Sınıfta kaldınız. Seneye tekrar görüşmek üzere .");

    }
}
