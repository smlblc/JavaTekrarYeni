package gun6;

public class StringLastIndexOf {
    /*
    lastIndexOf()

    Returns the position of the last found
    occurrence
    of specified characters in a string
    Stringde aradigimiz belli bir karakterin son bulundugu pozisyonunu verir.
    int
     */
    public static void main(String[] args) {
        String text = "Hello";
        System.out.println(text.lastIndexOf( 'l' )); //3

        String t2 = "Good mood";
        System.out.println( t2.lastIndexOf( "oo" ) ); //6

    }
}
