package gun8;

public class JavaAssignmentOperators {
    /*

+=
Addition assignment
i+=5;
i=i+5

-=
Subtraction assignment
j-=10;
j=j-10;

*=
Multiplication assignment
k*=2;
k=k*2;

/=
Division assignment
x/=10;
x=x/10;

%=
Remainder assignment
a%=4;
a=a%4;

     */

    public static void main(String[] args) {
        // += Addition assignment
        int i = 0;
        i += 5; // i = i + 5;
        System.out.println( "i+=5 is " + i );

        // -= Subtraction assignment
        int j = 100;
        j -= 10; // j = j - 10;
        // 100 - 10 => 90
        System.out.println( "j-=10 is " + j );

        // *= Multiplication assignment
        int k = 4;
        k *= 2; //k = k * 2;
        System.out.println( "k*=2 is " + k );

        // /= Division assignment
        int x = 50;
        x /= 10; // x = x / 10;
        System.out.println( "x/=10 is " + x );

        // %= Remainder assignment
        int a = 16;
        a %= 4; // a = a % 4;
        System.out.println( "a%=4 is " + a );
    }
}
