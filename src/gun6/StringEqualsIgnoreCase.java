package gun6;

public class StringEqualsIgnoreCase {

    /*
    equalsIgnoreCase()

    Compares two strings, ignoring case considerations
    Kucuk Buyuk farketmeden esitmi degilmi karsilastirir ve boolen dondurur.


    boolean
     */
    public static void main(String[] args) {
        String t1 = "Hello";
        String t2 = "Bonjour";

        System.out.println(t1.equalsIgnoreCase( t2 )); // false
        System.out.println(t1.equalsIgnoreCase( "Hello")); // true

        System.out.println( t1.equalsIgnoreCase( "hello" ) ); // true
    }
}
