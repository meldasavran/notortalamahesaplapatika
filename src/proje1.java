import java.util.Scanner;
//koşullu ifadelerle not ortalaması hesaplayan program
public class proje1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
       System.out.print("Matematik notunuzu giriniz:");
        int a,b,c,d,e,f;
        a= inp.nextInt();
        System.out.print("Türkçe notunuzu giriniz:");
        b=inp.nextInt();
        System.out.print("Tarih notunuzu giriniz:");
        c=inp.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        d=inp.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        e=inp.nextInt();
        System.out.print("Müzik notunuzu giriniz:");
        f=inp.nextInt();
        int toplam= (a+b+c+d+e+f);
        double ortalama=toplam/6.0;
        System.out.println("Genel ortalama: " + ortalama);
        System.out.println(ortalama > 60 ? "Sınıfı Geçti." : "Sınıfta kaldı.");

    }




}

