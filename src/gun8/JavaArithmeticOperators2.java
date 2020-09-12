package gun8;

public class JavaArithmeticOperators2 {
    /*

*
x * y
Multiplies x by y
int m = 10*2; // m=20

/
x / y
Divides x by y
float div = 20/100 ; // div = 0.2

%
x % y
Computes the remainder of dividing x by y
int rm = 20/3; // rm = 2

     */

    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        System.out.println( "*: multiplication" );
        System.out.println( "a*b=" + (a * b) );
        System.out.println( "2*3=" + (2 * 3) );

        System.out.println( "\n/: division" );
        System.out.println( "a/b=" + (a / b) );
        System.out.println( "6/2=" + (6 / 2) );

        System.out.println( "\n%: mod" );
        System.out.println( "a%b=" + (a % b) );
        System.out.println( "9%2=" + (9 % 2) );

    }
}
