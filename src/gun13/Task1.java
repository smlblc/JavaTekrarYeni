package gun13;

import java.util.Scanner;

public class Task1 {
    // write a java program which calculate sum from [50 to 100];

    // part 2
    // ask user to provide a number;
    // calculate sum from 0 to provided number
    // ex: provided number 2
    //     0+1+2 => 3

    public static void main(String[] args) {
        //part 1
//        int result = 0;
//        int counter = 50;
//        while(counter <= 100) {
//            System.out.println( "Num:" + counter );
//            result += counter; //result = result + counter;
//            // 1. result= 0 + 50;
//            // 2. result= 50 + 51;
//            counter++;
//        }
//        System.out.println( "Sum from 50-100: " + result );

        Scanner scanner = new Scanner( System.in );
        System.out.println( "provide a number: " );

        int providedNumber = scanner.nextInt();

        int sum = 0;
        int i = 0;

        while(i <= providedNumber) {
            sum += i;
            System.out.println( "Adding: " + i );
            ++i;
        }

        System.out.println( "\nSum is: " + sum );

    }
}
