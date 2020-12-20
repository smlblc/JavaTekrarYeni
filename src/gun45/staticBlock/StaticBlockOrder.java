package gun45.staticBlock;

public class StaticBlockOrder {

    static {
        System.out.println("1");
    }

    static {
        System.out.println("2");
    }

    public static void main(String[] args) {

    }

    static {
        System.out.println("3");
    }
}
