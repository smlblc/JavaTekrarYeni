package gun5;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Biletiniz cift yonlu olsun mu? (True/False)");
//        boolean biletCiftYonluMu = scanner.nextBoolean(); //Ctrl+C ile secip Ctrl+Alt+V
//        System.out.println("Biletinit cift Yonlu: " + biletCiftYonluMu);
//
//        System.out.println("Biletiniz ucreti icin max rakam? Double olarak giriniz");
//        double biletUcreti = scanner.nextDouble(); //Ctrl+C ile secip Ctrl+Alt+V
//        System.out.println("Biletiniz icin max rakam : " + biletUcreti);
//
//        System.out.println("Biletiniz ucreti icin max rakam? Float olarak giriniz");
//        float biletUcretiFloat = scanner.nextFloat(); //Ctrl+C ile secip Ctrl+Alt+V
//        System.out.println("Biletiniz icin max rakam : " + biletUcretiFloat);
//
//        //short  --> nextShort()
//        System.out.println( "Toplam miktar bilet icin?" );
//        short biletToplamShort = scanner.nextShort();
//
//        System.out.println( "Toplam miktar bilet icin: " + biletToplamShort );


        //byte  ->> nextByte()  -128 -- 127
        System.out.println( "Kac bilet almak istiyorsunuz? " );
        byte toplamBiletsayisi = scanner.nextByte();
        System.out.println("Toplam "+toplamBiletsayisi+ " bilet aldiniz.");

        //scanner ile char kullanamiyoruz
//        System.out.println( "Bir karakter giriniz? " );
//        char karakter = scanner.nextChar();
//        System.out.println("girdiginiz "+karakter+ ".");

    }
}
