package gun8;

public class Task3 {
// Write a Java program that calculate average of following numbers
// hint: some of them are integers

//   input: 23.4, 24.0, 12, 450.3, 23000

    public static void main(String[] args) {
        // 1. way
        double average = (23.4 + 24.0 + 12 + 450.3 + 23000) / 5;
        System.out.println( "1. way: " + average );

        // 2. way
        int integers = 12;
        integers += 23000;

        double decimals = 23.4;
        decimals += 24.0;
        decimals += 450.3;

        double avg = (integers + decimals) / 5;
        System.out.println( "2. way: " + avg );
    }

}
