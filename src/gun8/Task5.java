package gun8;

import java.util.Scanner;

public class Task5 {
// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// formula
            // (32°F − 32) × 5/9 = 0°C
            // c = (f-32)*5/9

//Scanner kullanin

    public static void main(String[] args) {

        int fahrenheit = 10;
        System.out.println((fahrenheit - 32) * 5/9);

        Scanner sc = new Scanner(System.in);
        int fahrenheit1 = sc.nextInt();
        System.out.println((fahrenheit1 - 32) * 5/9);
    }
}
