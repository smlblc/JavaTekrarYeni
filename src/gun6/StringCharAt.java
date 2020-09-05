package gun6;

public class StringCharAt {
    /*
     charAt()
     Returns the character at the specified index (position)
     spesifik bir indexteki karakteri alir.

    char
     */

    public static void main(String[] args) {
        String text = "Google";
        System.out.println(text.charAt(5)); // e

        System.out.println(text.charAt( -1 )); //gives exception
    }
}
