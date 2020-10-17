package gun16;

import java.util.Random;

public class Task2 {
    // create an array with size 10
    // populate your array with random numbers using Random or Math.random()

    // part2: sum values of array

    // part3: get average of array

    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();

        int sum = 0;
        for(int i = 0; i < array.length; i++) { // 0 1 2 3 4 5 6 7 8 9
            int randomNumber = random.nextInt( 1000 );
            array[i] = randomNumber;
            //array[i] = (int)(Math.random() * 100);

            //to sum you array values
            sum += array[i];
        }

        System.out.println( "Sum is: " + sum );

        System.out.println( "Average is: " + ((double) sum / array.length) );

    }

}
