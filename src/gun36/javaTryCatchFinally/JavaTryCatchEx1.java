package gun36.javaTryCatchFinally;

public class JavaTryCatchEx1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int result = 0;
        try {
            result = a / b;
            System.out.println(result);
        } catch(Exception exception) {
            System.out.println("something gone wrong, please look to variables");

            System.out.println(exception);
            exception.printStackTrace();
            System.err.println("Error is here");

        } finally {
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("result: " + result);
        }

        System.out.println("End of code");

    }
}
