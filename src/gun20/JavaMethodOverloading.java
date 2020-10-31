package gun20;

public class JavaMethodOverloading {
    /*
    Different ways of doing overloading methods:
    1. The number of parameters in two methods.
    2. The data types of the parameters of methods.
    3. The Order of the parameters of methods.
     */

    public static void main(String[] args) {
        int sum = sum(1, 2);
        int sum1= sum(1,2, 3);
        double doubleSum = sum(1.1, 2.2);
        int sumOf5 = sum(5, 5, 5);
        printUser("Sam", 40);
        printUser(40, "Sam");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    //1. The number of parameters in two methods.
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //2. The data types of the parameters of methods.
    public static double sum(double a, double b) {
        return a + b;
    }


    //    3. The order of the parameters of methods.
    public static void printUser(String name, int age) {
        //you code
    }

    public static void printUser(int age, String name) {
        //you code
    }
}
