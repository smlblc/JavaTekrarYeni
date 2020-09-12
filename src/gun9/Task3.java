package gun9;

import java.util.Scanner;

public class Task3 {
    // Write a Java program to get a number from the user
    // and print whether it is positive or negative

    // part 2: check for zero also

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.println( "Provide a number please: " );
        int num = input.nextInt();

        if(num > 0) {
            System.out.println( "Your number is positive!!!" );
        }

        if(num < 0) {
            System.out.println( "Your number is negative!!!" );
        }

        if(num == 0) {
            System.out.println( "Your number is zero" );
        }
    }

}
