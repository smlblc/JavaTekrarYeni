package gun45;

public class MyClass {

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Initializer Block");
    }

    MyClass() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("main method");

        new MyClass();
    }
}

