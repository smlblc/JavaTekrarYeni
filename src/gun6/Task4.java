package gun6;

public class Task4 {
    //Given two strings, a and b,
    // output the result of putting them together in the order abba,
    // e.g. "Hi" and "Bye" returns "HiByeByeHi".
    public static void main(String[] args) {
        String a = "Hi";
        String b = "Bye";

        System.out.println(a.concat(b).concat(b).concat(a));
    }
}
