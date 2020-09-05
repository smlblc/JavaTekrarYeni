package gun5;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.println("ilk sayiyi giriniz?: "); // 5
        int a = girdi.nextInt();

        System.out.println("ikinci sayiyi giriniz?: "); // 7
        int b = girdi.nextInt();

        int toplam = a + b;

        System.out.println("Toplam: " + toplam);
        System.out.println("Toplam: " + a + b);   // concatanation (ekleme) yapti
        System.out.println("Toplam: " + (a + b)); // Parantez oldugu icin Airtmetik islem yapti.

    }
}
