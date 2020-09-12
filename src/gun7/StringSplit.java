package gun7;

import java.util.Arrays;

public class StringSplit {

    /*
     split()

     Splits a string into an array of substrings

     String[]
     */

    public static void main(String[] args) {
        String text = "SOFTWARE DEVELOPER in TEST";

        System.out.println( Arrays.toString( text.split( " " ) ) );
    }
}
