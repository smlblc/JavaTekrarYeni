package gun15;

public class Task3 {
    //TODO
    // Write program using nested loops that prints:
    // *
    // **
    // ***
    // ****
    // *****

    public static void main(String[] args) {

        for(int row = 1; row <= 5; row++) {
            for(int col = 1; col <= 5; col++) {
                if(col <= row) {
                    System.out.print( "*" );
                }
            }

            System.out.println();
        }

    }
}
