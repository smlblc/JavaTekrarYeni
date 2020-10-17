package gun17;

import java.util.Arrays;

public class JavaArraysMethods {

    public static void main(String[] args) {
        //to print array
        System.out.println( "to print array" );
        String[] names = {"John", "Ali", "Marta"};
        System.out.println( Arrays.toString( names ) );


        //to sort array // array`i siralamak icin
        System.out.println( "\nto sort array" );
        int[] numbers1 = {4, 1, 9, 5, 3};
        System.out.println( "before sort: " + Arrays.toString( numbers1 ) );
        Arrays.sort( numbers1 );
        System.out.println( "after sort: " + Arrays.toString( numbers1 ) );
//        Arrays.sort(numbers1, 2,5);
//        System.out.println( "after sort except o index: " + Arrays.toString( numbers1 ) );

        // to check if two arrays are equal
        System.out.println( "\nto check if two arrays are equal" );
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {3, 2, 1};
        System.out.println( "if a == b: " + Arrays.equals( a, b ) );
        System.out.println( "if b == c: " + Arrays.equals( b, c ) );
        Arrays.sort( c );
        System.out.println( "after sort c, if b == c: " + Arrays.equals( b, c ) );

        boolean checkingArrays = Arrays.equals( a, b ) && Arrays.equals( b, c );
        System.out.println( "a==b && b == c: " + checkingArrays );

        // to populate/fill your array
        System.out.println( "\nto populate/fill your array" );
        int[] numbers2 = new int[10];
        System.out.println( "before filling array: " + Arrays.toString( numbers2 ) );
        Arrays.fill( numbers2, 8 );
        System.out.println( "after filling array: " + Arrays.toString( numbers2 ) );

        // to search value in SORTED array and return index
        System.out.println( "\nto search value in SORTED array and return index" );
        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println( "search for 3: " + Arrays.binarySearch( numbers3, 3) );
    }

}
