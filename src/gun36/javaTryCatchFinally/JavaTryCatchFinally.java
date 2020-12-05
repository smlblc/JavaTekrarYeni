package gun36.javaTryCatchFinally;

public class JavaTryCatchFinally {

    public static void main(String[] args) {
        // null, "", "          "

        String str = "";

        try {// try block to test your statements
            char charAt = str.charAt(0);
            System.out.println("Try block");
        } catch(Exception ex) {// catch block is executed only when you have exception
//            ex.printStackTrace();
            System.out.println("Catch block");
        } finally { // finally block is executed no matter what
            System.out.println("Finally block");
        }

        System.out.println("End of code");
    }
}
