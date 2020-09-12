package gun8;

import java.util.Scanner;

public class Task4 {
    // Write a Java program that reads a number and display the square, cube

    public static void main(String[] args) {
        // square of 2 is : 2 * 2 = 4
        // cube of 2 is : 2 * 2 * 2 = 8

        Scanner input = new Scanner( System.in );

        System.out.println( "Provide a number: " );
        double number = input.nextDouble();

        double square = number * number;
        System.out.println( "Square of " + number + " is: " + square );

        double cube = square * number;
        System.out.println( "Cube of " + number + " is: " + cube );

    }

}
