package gun32.nonAccessModifier.staticModifier;

public class Simple {
    //class member/variable/field
    static int a;

    //instance member/variable/field
    int b;

    void increase() {
        a++;
        b++;
    }

    public static void main(String[] args) {
        Simple s1 = new Simple();
        s1.increase();

        Simple s2 = new Simple();
        s2.increase();
    }

}
