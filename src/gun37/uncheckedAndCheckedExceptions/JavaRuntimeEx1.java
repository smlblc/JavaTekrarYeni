package gun37.uncheckedAndCheckedExceptions;

import java.util.Scanner;

public class JavaRuntimeEx1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Provide first number: ");
        int a = scan.nextInt();

        System.out.print("Provide second number: ");
        int b = scan.nextInt();

        //unchecked(unexpected) exception will be thrown here(Arithmetic exception)
        //we cant predict it before we execute/do that
        System.out.println("a/b = " + (a / b));

        ///java.util.InputMismatchException
    }
}
