package gun7;

public class StringTrim {
    /*
     trim()

     Removes whitespace from both ends of a string

     String
     */

    public static void main(String[] args) {
        String text = "     Rock !!!    ";

        System.out.println(">>>" + text + "<<<");
        System.out.println( ">>>" + text.trim() + "<<<" );
    }
}
