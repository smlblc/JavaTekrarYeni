package gun13;

import java.util.Scanner;

public class JavaWhileEx3 {

    // write a program to check pin code
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.println( "Provide a pin code: " );
        int userPin = input.nextInt();

        int pinCode = 5555;
        while(userPin != pinCode) {
            System.out.println( "Incorrect pin" );
            System.out.println( "Provide a pin code, again: " );
            userPin = input.nextInt();
        }

        System.out.println( "Entered successfully" );

    }
}
