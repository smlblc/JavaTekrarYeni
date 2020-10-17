package gun16;

import java.util.Random;
import java.util.Scanner;

public class LotteryGame {
    // create a lottery game
    // which will determine who is winner from provided players
    // hint: array, for, scanner, length

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println( "Welcome to lottery game in Java" );
        System.out.println( "Provide names of three people:" );
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();


        Random rand = new Random();
        int randomNumber = rand.nextInt( 4 ); //0 1 2 3

        if(randomNumber == 1) {
            System.out.println( "Winner is: " + name1 );
        } else if(randomNumber == 2) {
            System.out.println( "Winner is: " + name2 );
        } else if(randomNumber == 3) {
            System.out.println( "Winner is: " + name3 );
        } else {
            System.out.println( "No one won" );
        }
    }
}

