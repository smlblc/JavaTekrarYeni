package gun11;

import java.util.Random;

public class JavaRandom {

    public static void main(String[] args) {
        // Math.r1(); gives r1 number between 0.0 and 1.0
        double r1 = Math.random();    // Random classin sadece nextDouble ozelligini kullaniyor.
        //to get number between 0 - 10
        int r2 = (int) (r1 * 10);
        System.out.println( "r1 double: " + r1 );
        System.out.println( "r2 integer: " + r2 );


        Random random = new Random();
        int randomInt = random.nextInt( 3 ); // 0 1 2
        System.out.println( "Random int: " + randomInt );


    }

}
