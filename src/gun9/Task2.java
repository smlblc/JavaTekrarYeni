package gun9;

import java.util.Scanner;

public class Task2 {
    // write a java program, where user provides prices of two items
    // and your program should calculate total price

    //input:
    // Enter price of item 1:
    // $10.9
    // Enter price of item 2:
    // $1.1

    //output:
    // Total: $12.0

    //part 2: you can add tax

    //part 3:
    //input should be like
    // Apple $1.1
    // Bread $3.0
    //output should be like
    // Total of Apple and Bread is: $4.1

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.print( "Enter item 1 price: " );
        String s1 = scan.nextLine();

        System.out.print( "Enter item 2 price: " );
        String s2 = scan.nextLine();

        s1 = s1.replace( "$", "" );
        s2 = s2.replace( "$", "" );

        double total = Double.valueOf( s1 ) + Double.valueOf( s2 );
        System.out.println( "Total: $" + total );
    }

}
