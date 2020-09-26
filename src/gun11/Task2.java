package gun11;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    // Let user provide a number between 0 and 3
    // and generate a random number between 0 and 3
    // and check if provided number is equal to generated number
    // if they are equal print out "You Won the Game!!!"
    // else "Game Over!!!"

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print( "Provide a number between 0 and 3 please: " );
        int userNumber = input.nextInt();

//        int min = 0;
//        int max = 3;
//        int generatedNumber = (int) (Math.random() * ((max - min) + 1)) + min;

        Random rand = new Random();
        int generatedNumber = rand.nextInt( 4 ); // 0 1 2 3

        if(userNumber == generatedNumber) {
            System.out.println( "You Won the Game!!!" );
        } else {
            System.out.println( "Game Over!!!" );
            System.out.println( "Generated number was: " + generatedNumber );
        }

    }

}
//27