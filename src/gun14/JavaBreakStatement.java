package gun14;

public class JavaBreakStatement {

    public static void main(String[] args) {
        System.out.println( "Start of code" );

        for(int i = 0; i < 100; i++) {
            if(i == 5) {
                break;
            }

            System.out.println( i );
        }

        System.out.println( "End of code" );
    }

}
