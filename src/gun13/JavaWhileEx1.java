package gun13;

public class JavaWhileEx1 {

    public static void main(String[] args) {
        // sum numbers between 0 and 5; // 0 ile 5 arasindaki sayilari toplayin

        int result = 0;

        int i = 0;
        while(i < 0) {
            result = result + i;
            System.out.println( "number: " + i );
            ++i;
        }

        System.out.println( "result: " + result );

    }

}
