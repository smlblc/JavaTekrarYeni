package gun9;

public class JavaComparisonOperators {

    /*

==
Equality operator
a==b
false

!=
Not Equal to operator
a!=b; 10!=15
true

>
Greater than
a>b; 10 > 15
false

<
Less than
a<b; 10 < 15
true

>=
Greater than or equal to
a>=b; 10 >= 15
false

<=
Less than or equal to
a<=b; 10 <= 15
true

     */
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        System.out.println( "a equals to b: " + (a == b) );
        System.out.println( "a not equals to b: " + (a != b) );
        System.out.println( "a greater than b: " + (a > b) );
        System.out.println( "a less than b: " + (a < b) );
        System.out.println( "a greater than or equals to b: " + (a >= b) );
        System.out.println( "a less than or equals to b: " + (a <= b) );

        String str = "123";
        int i = Integer.parseInt( str );

        double dnum = Double.parseDouble( str );
    }
}
