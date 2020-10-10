package gun13;

import java.util.Scanner;

public class Task4 {
    // write a program to check pin code
    // using do while loop
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );


        int userPin;
        int pinCode = 5555;
        boolean firstIteration = true;
        do {
            if(firstIteration) {
                System.out.println( "Incorrect pin" );
                firstIteration = false;
            }

            System.out.println( "Provide a pin code: " );
            userPin = input.nextInt();

        } while(userPin != pinCode);

        System.out.println( "Entered successfully" );

    }
}
