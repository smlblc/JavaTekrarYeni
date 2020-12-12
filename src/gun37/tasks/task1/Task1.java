package gun37.tasks.task1;

import java.util.Scanner;

public class Task1 {
    // create application that converts text to integer
    // input should be string: Scanner
    // output should be integer

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide a number, please:");
        String str = scanner.nextLine();
        int integer = convertToInt(str);

        System.out.println("Integer is: " + integer);
    }

    public static int convertToInt(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt;
        } catch(Exception e) {
            System.out.println("Please, provide correct number in digit format");
            System.out.println("Giving '0' as default number");
        }
        return 0;
    }
}
