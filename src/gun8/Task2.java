package gun8;

import java.util.Scanner;

public class Task2 {
    // Write a Java program that print the average of three integers:
    // a, b, c (a = 5, b= 3, c= 2)
    // output:
    // (a+b+c)/3 = 3.33333333333

    // part 2: provide numbers using scanner

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        int sayi1 = scan.nextInt();

        System.out.print("Ikinci sayiyi giriniz ");
        int sayi2 = scan.nextInt();

        System.out.print("ucuncu sayiyi giriniz :");
        int sayi3 = scan.nextInt();

        double ortalama = (sayi1+sayi2+sayi3) / 3.0;

        System.out.println(ortalama);
    }
}
