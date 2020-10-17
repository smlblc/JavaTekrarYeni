package gun15;

public class JavaLabeledLoop {

    public static void main(String[] args) {

        OUTER_LOOP:
        for(int i = 0; i < 5; i++) {

            INNER_LOOP:
            for(int j = 0; j < 5; j++) {
                System.out.println( "i:" + i + " j:" + j );
                if(j == 2) {
                    break OUTER_LOOP;
                }

            }

            System.out.println();

        }

    }
}
