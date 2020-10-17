package gun15;

public class JavaLabeledLoopEx1 {

    public static void main(String[] args) {
        // demonstrating different nested loops with labels
        loop_1:
        for(int i = 0; i < 10; i++) {


            loop_2:
            while(i < 5) {

                loop_3:
                do {
                    System.out.println("i: "+i);
                    break loop_2; // will stop loop_2, but loop_1 is running/executing/iterating without stop
                } while(i < 3);
            }
        }
    }
}
