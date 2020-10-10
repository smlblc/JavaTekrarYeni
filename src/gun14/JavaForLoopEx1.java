package gun14;

public class JavaForLoopEx1 {

    public static void main(String[] args) {

        // to get last value of i
        int last_value_i = 0;
        for(int i = 0; i < 5; i++) {
            last_value_i = i;
            // 1. 0
            // 2. 1
            ///...
            ///5. 4
        }
        System.out.println( last_value_i );


        // infinite loop
        for(int i = 0; ; i++) {
            System.out.println( "infinite: " + i );
        }


    }

}
