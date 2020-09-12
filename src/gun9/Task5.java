package gun9;

import java.util.Scanner;

public class Task5 {
    // Write a Java program to get a text from the user
    // and print whether it has 't' letter in it

    public static void main(String[] args) {

        Scanner s = new Scanner( System.in );

        System.out.println( "Provide text please: " );
        String text = s.nextLine();

        if(text.contains( "t" )) {
            System.out.println( "you got 't'!!!" );
        }

    }

}
