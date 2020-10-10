package gun14;

public class JavaContinueStatement {
    public static void main(String[] args) {
        System.out.println( "Start of code" );

        for(int i = 0; i < 5; i++) {
            if(i == 2) {
                continue;
            }

            System.out.println( i );
        }

        System.out.println( "End of code" );
    }
}
