package gun6;

public class StringEquals {

    /*
    equals()

    Compares two strings. Returns true if the strings are equal, and false if not
    iki stringi karsilastirir eger esitlerse true degilse false dondurur.
    boolean
    */

    public static void main(String[] args) {
        String t1 = "Hello";
        String t2 = "Bonjour";

        System.out.println(t1.equals( t2 )); // false
        System.out.println(t1.equals( "Hello")); // true

        System.out.println( t1.equals( "hello" ) ); // false
    }
}
