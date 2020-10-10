package gun14;

public class JavaBreakStatementEx1 {

    // check string, if it has letter a, stop the loop
    // Stay at home
    // S
    // t
    // stop


    public static void main(String[] args) {
        String text = "Stay at home";

        for(int i = 0; i < text.length(); i++) {
            char letter = text.charAt( i );

            if(letter == ' ') {
                break;
            }

            System.out.println( letter );
        }

        System.out.println( "end of code" );


    }


}
