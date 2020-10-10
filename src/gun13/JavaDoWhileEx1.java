package gun13;

public class JavaDoWhileEx1 {

    public static void main(String[] args) {
        // print from 0 to 5; 0 1 2 3 4 5
        int i = 0;
        do {
            System.out.println( "number1: " + i );
            i++;
        } while(i <= 5); // 1 > 5  = false

        // part 2.
        i = 0;
        do {
            System.out.println( "number2: " + i );
            i++;
        } while(i > 5); // 1 > 5  = false
    }

}
