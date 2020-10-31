package gun20;

public class JavaMethodMultipleParameters {

    public static void main(String[] args) {
        printNameAndAge("John", 28);
        printNameAndAge("Sarah", 17);
    }

    public static void printNameAndAge(String name, int age) {
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
    }
}
