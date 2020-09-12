package gun9;

import java.util.Scanner;

public class Task1 {
    // read number from user, using nextLine()
    // parse it to integer
    // add 100 to number
    // print the number
    //input: 2
    //output: 102

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        System.out.println( "Provide number please: " );
        String s = scan.nextLine();
        int num = Integer.valueOf( s );
        num += 100;

        System.out.println( "added 100 to number: " + num );
    }

}
