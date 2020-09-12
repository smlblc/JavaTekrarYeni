package gun9;

import java.util.Scanner;

public class Task0 {
    // using scanner provide a number
    // and check if its greater than 100
    // input: 99
    // output: 99 > 100: false

    // part2:
    // using if statement, check if it is greater than 100
    // only then print output
    // 12:15

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        System.out.println( "Provide a number to check n > 100" );
        int n = scan.nextInt();

        // part 1
        System.out.println( n + " > 100: " + (n > 100) );

        //part 2
        if(n > 100) {
            System.out.println( n + " is greater than 100" );
        }
    }
}
