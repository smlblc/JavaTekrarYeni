package gun10;

public class ifVsElseIf {

    // if
    // if
    // if
    // if    sadece if kullanirsan her bir if `in icine girer ve her bir durumu kontrol eder.

    //if
    //else if
    //else if
    //else if oldugunda ustteki durum yanlissa alttaki else i kontrol eder ama dogru ise sace ustteki duruma bakar.
    //else if ustteki if ile baglantilidir...

    public static void main(String[] args) {
        int sayi = 20;

        if (sayi >= 15 ) {
            System.out.println("Sayimiz "+sayi+">=15 tir.");
        }else if(sayi >= 10 ) {
            System.out.println("Sayimiz "+sayi+">=10 tir.");

        }

    }
}
