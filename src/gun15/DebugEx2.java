package gun15;

public class DebugEx2 {

    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = a;

        System.out.println( "a: " + (++a) );
        System.out.println( "b: " + (b++) );

        System.out.println( "b: " + b );

    }

}
