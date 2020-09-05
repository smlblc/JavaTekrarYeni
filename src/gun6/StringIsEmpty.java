package gun6;

public class StringIsEmpty {
    /*
     isEmpty()

     Checks whether a string is empty or not
    String bos mu degil mi onu kontrol eder ve boolean donderir.

    boolean
     */

    public static void main(String[] args) {
        String text = "Hi";
        System.out.println( "Is text variable is empty: " + text.isEmpty() );

        String t2 = "";
        System.out.println( "Is t2 variable is empty: " + t2.isEmpty() );

        String t3 = " ";
        System.out.println( "Is t3 variable is empty: " + t3.isEmpty() );
    }

}
