package gun17;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    // part1. fill array with random values using Random/Math.random, 0 <= random N <= 10
    // arrays size = 10

//    part2. check if an array of has 0, print => "it has zero"
    //part3. check if array has 10, print => "it has 10"

    //part4. check if array has 0 and 10, print => "it has zero and ten"

    //part4.1 check if array has 0 and 10, print => "it has zero and ten"
           // also print their indexes

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        // part 1
        System.out.println( "Part 1 ---------------------------" );

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt( 11 );
        }
        System.out.println( Arrays.toString( numbers ) );

//        //part2. check if an array of has 0, print => "it has zero"
        System.out.println( "Part 2 ---------------------------" );
        for(int number : numbers) {
            if(number == 0) {
                System.out.println( "it has zero" );
            }
        }
//
//        //part3. check if array has 10, print => "it has 10"
        System.out.println( "Part 3 ---------------------------" );
        for(int number : numbers) {
            if(number == 10) {
                System.out.println( "it has ten" );
            }
        }

        //part4. check if array has 0 and 10, print => "it has zero and ten"
        System.out.println( "Part 4 ---------------------------" );
        //1. way
        // 0, 1 , 2 , 3 , 0
//        int zeroCounter = 0;
//        int tenCounter = 0;
//        for(int number : numbers) {
//            if(number == 0) {
//                zeroCounter++;
//            } else if(number == 10) {
//                tenCounter++;
//            }
//        }
//        if(zeroCounter >= 1 && tenCounter >= 1) {
//            System.out.println( "it has zero and ten" );
//        }
        //2. way
        boolean hasZero = false;
        boolean hasTen = false;
        for(int number : numbers) {
            if(number == 0) {
                hasZero = true;
            } else if(number == 10) {
                hasTen = true;
            }
        }
        if(hasZero && hasTen) {
            System.out.println( "it has zero and ten" );
        }

    }

}
