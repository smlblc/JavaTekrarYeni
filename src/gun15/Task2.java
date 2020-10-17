package gun15;

public class Task2 {
    //using loop print multiplication table of 1
    // part1:
    // 1 x 1 = 1
    // 1 x 2 = 2
    // 1 x 3 = 3
    // 1 x 4 = 4
    // 1 x 5 = 5
    // 1 x 6 = 6
    // 1 x 7 = 7
    // 1 x 8 = 8
    // 1 x 9 = 9
    // 1 x 10 = 10

    //part2: using nested loop, print multiplication table of 1,2,3,4,5,6,7,8,9,10

    public static void main(String[] args) {


        for(int a = 1; a <= 10; a++) {
            System.out.println("------------------------------");

            for(int b = 1; b <= 10; b++) {

                int result = a * b;
                System.out.println( a + " x " + b + " = " + result );
            }
        }


    }
}
