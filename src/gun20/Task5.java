package gun20;

public class Task5 {
    // print various numbers of different datatypes
    // by creating different methods with the same name 'printn'
    // having a parameter for each datatype.

    // datatypes: int, double, float, byte, long

    public static void main(String[] args) {
        printn(10);
        printn((byte)20);
        printn(30L);
        printn(40f);
        printn(50D);
    }

//    public static void printn(int n) {
//        System.out.println("You have integer: " + n);
//    }

    public static void printn(double n) {
        System.out.println("You have double: " + n);
    }

    public static void printn(float n) {
        System.out.println("You have float: " + n);
    }

    public static void printn(byte n) {
        System.out.println("You have byte: " + n);
    }

    public static void printn(long n) {
        System.out.println("You have long: " + n);
    }

    public static void printn(int n) {
        System.out.println("You have int: " + n);
    }

}
