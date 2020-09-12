package gun8;

public class JavaArithmeticOperators1 {
    /*
    + : plus, addition
    x + y
    Adds x and y
    float num = 23.4 + 1.6; // num=25

    - : minus
    x - y
    Subtracts y from x
    long n = 12.456 – 2.456; //n=10

    -x :
    Arithmetically negates x
    int i = 10; -i; // i = -10

     */
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // +
        System.out.println( "+: plus" );
        System.out.println( "x+y=" + (x + y) ); // operation on variables
        System.out.println( "5+3=" + (5 + 3) ); // operation on values

        // - : minus
        System.out.println( "\n-: minus" );
        System.out.println( "x-y=" + (x - y) );
        System.out.println( "5-3=" + (5 - 3) );

        // - : negation
        System.out.println( "\n-: negate" );
        System.out.println( "x=" + x );
        System.out.println( "after negation x=" + (-x) );
    }

}
