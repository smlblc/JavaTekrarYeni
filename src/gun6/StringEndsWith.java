package gun6;

public class StringEndsWith {
    /*
     endsWith()

     Checks whether a string ends with the specified character(s)

     boolean
     */

    public static void main(String[] args) {

        String text = "Hello world";

        System.out.println( "is text ends with Hello: " + text.endsWith( "Hello" ) ); // False
        System.out.println( "is text ends with hello: " + text.endsWith( "hello" ) ); // False
        System.out.println( "is text ends with world: " + text.endsWith( "world" ) ); // True
        System.out.println( "is text ends with world: " + text.endsWith( "World" ) ); // False


    }
}
