package gun19;

import java.util.Arrays;

public class JavaMethodParameters {

    public static void main(String[] args) {

        sumAndPrint( 4, 3 );
        sumAndPrint( 7, 3 );
        sumAndPrint( 10, 10 );
        //sumAndPrint( 1.1, 1.10 ); can provide double when it requires int

        double[] prices = {1.95, 3.45, 5.6, 1.1};
        System.out.println("Array prints:");
        System.out.println( Arrays.toString( prices ) );
        printReverseArray( prices );

    }

    // sums a and b, then prints sum as result
    public static void sumAndPrint(int a, int b) {
        System.out.println( a + " + " + b + " = " + (a + b) );
    }

    //given array, prints it in reverse order
    public static void printReverseArray(double[] array) {
        for(int i = array.length - 1; i >= 0; i--) {
            System.out.print( array[i] + ", " );
        }
        System.out.println();

    }

}
