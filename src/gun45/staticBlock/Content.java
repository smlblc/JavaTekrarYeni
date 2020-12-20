package gun45.staticBlock;

public class Content {
    public static String url;

    static {
        int a = 10;
        url = "techno.study";
        System.out.println("Content static block");
    }

    {
        System.out.println("Content initializer block 1");
    }

    public Content() {
        System.out.println("Content constructor");
    }
}
