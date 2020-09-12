package gun8;

import java.util.Scanner;

public class Task1 {

    // Write a Java program that multiplies four integers and  print result

    //part 2: use scanner to provide numbers

    public static void main(String[] args) {

        System.out.println("4 sayi carpimi: " + 2*3*4*5);

        int a = 5;
        int b = 6;
        int c = 3;
        int d = 2;
        System.out.println(a*b*c*d);

        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Sayı: ");
        int sayi1 = scanner.nextInt();

        System.out.println("2.Sayı: ");
        int sayi2 = scanner.nextInt();

        System.out.println("3.Sayı: ");
        int sayi3 = scanner.nextInt();

        System.out.println("4.Sayı: ");
        int sayi4 = scanner.nextInt();

        System.out.println("Carpim = " + sayi1*sayi2*sayi3*sayi4);
    }
}
