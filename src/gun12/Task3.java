package gun12;

import java.util.Random;

public class Task3 {
    // write a program that prints word representation of your number
    //      where number is between 0 and 5
    // ex: 0 => zero
    // ex: 3 => three

    //part 2: do the opposite
    // ex: zero => 0

    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt( 6 );
        System.out.println( "number is " + number );

        String numberRepresentation = "";

        switch(number) {
            case 0:
                numberRepresentation = "zero";
                //System.out.println( "zero" );
                break;
            case 1:
                numberRepresentation = "one";
                break;
            case 2:
                numberRepresentation = "two";
                break;
            case 3:
                numberRepresentation = "three";
                break;
            case 4:
                numberRepresentation = "four";
                break;
            case 5:
                numberRepresentation = "five";
                break;
        }

        System.out.println( numberRepresentation );


    }

}
