package gun8;

import java.util.Scanner;

public class Task6 {
    // Write a Java program to compute body mass index (BMI).
// BMI: The BMI is defined as the body mass divided by the square of the body height,
//      and is universally expressed in units of kg/m2,
//      resulting from mass in kilograms and height in metres.
    //Scanner kullanarak yapin.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("kilonuzu yazınız");
        double Kilo = scanner.nextDouble();
        System.out.print("boyunuzu yazınız : ");
        double Boy = scanner.nextDouble();


        System.out.println("kutle ındexi:"+ Kilo / (Boy * Boy));
    }
}
