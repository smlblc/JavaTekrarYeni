package gun6;

public class StringReplaceAll {

    /*
     replaceAll()

     Replaces each substring of this string
     that matches the given regular expression
     with the given replacement

     String
     */

    public static void main(String[] args) {
        String text = "software DEVELOPER inc";

        System.out.println( text.replaceAll ( "[A-Z]", "d" ) );

        String text1 = "software 0123456789 inc";

        System.out.println( text1.replaceAll ( "[0-9]", "t" ) );

        String text2 = "software 0123456789 inc";

        System.out.println( text1.replaceAll ( "[^a-z]", "m" ) );
    }
}
