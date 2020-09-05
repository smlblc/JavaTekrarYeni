package gun6;

public class StringContains {
    /*
    contains()

    Checks whether a string contains a sequence of characters
    String icinde bir karakter dizisi olup olmadigini kontrol eder.

    boolean
     */

    public static void main(String[] args) {
        String t2 = "Good morning!!!";
        System.out.println( t2.contains ( "mor" ) ); // true
        System.out.println( t2.contains( "morin" ) ); //false
        System.out.println( t2.contains( "Mor" ) ); //false


    }
}
