package gun20;

public class Task1 {

    public static void main(String[] args) {
        String name1 = "John";
        String name2 = "Marks";
        String name3 = "Vepa";

        boolean areTwoNameEqualLength = twoNamesLength(name1, name2);
        boolean areThreeNameEqualLength = threeNamesLength(name1, name2, name3);

    }

    // create a method that checks if given two names have same length
    public static boolean twoNamesLength(String first, String second) {
        return first.length() == second.length();
    }

    // create a method that checks if given three names have same length
    public static boolean threeNamesLength(String a, String b, String c) {
        return twoNamesLength(a, b) && twoNamesLength(b, c);
    }

}
