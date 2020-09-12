package gun9;

import java.util.Scanner;

public class Task4 {
    // Take two numbers from the user and print the greatest number

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        System.out.print( "num 1: " );
        int num1 = scan.nextInt();

        System.out.print( "num 2: " );
        int num2 = scan.nextInt();

        if(num1 >= num2) {
            System.out.println( num1 );
        }

        if(num1 < num2) {
            System.out.println( num2 );
        }

    }

}
