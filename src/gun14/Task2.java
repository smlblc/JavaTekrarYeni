package gun14;

import java.util.Scanner;

public class Task2 {
    // write a java program which will show
    // multiplication table of 2
    //ex:
//    2 x 1 = 2
//    2 x 2 = 4
//    2 x 3 = 6
//    2 x 4 = 8
//    2 x 5 = 10
//    2 x 6 = 12
//    2 x 7 = 14
//    2 x 8 = 16
//    2 x 9 = 18
//    2 x 10 = 20

    //part 2: use scanner to provide a number
    // show multiplication table of provided number

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print("Enter number: ");

        int num = input.nextInt();
        int result;
        for(int i = 1; i <= 10; i++) {

            result = num * i;
            System.out.println( num + " x " + i + " = " + result );
        }
    }
}
