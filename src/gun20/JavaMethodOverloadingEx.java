package gun20;

public class JavaMethodOverloadingEx {

    public static void main(String[] args) {
        String name1 = "John";
        String name2 = "Marks";
        String name3 = "Vepa";

        boolean twoSameLength = isLengthSame(name1, name2);
        boolean threeSameLength = isLengthSame(name1, name2, name3);

    }

    // create a method that checks if given two names have same length
    public static boolean isLengthSame(String a, String b) {
        return a.length() == b.length();
    }

    // create a method that checks if given three names have same length
    public static boolean isLengthSame(String a, String b, String c) {
        return isLengthSame(a, b) && isLengthSame(b, c);
    }

}
