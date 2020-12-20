package gun45.questions.q2;


class A {
    String s = "Class A";
}

class B extends A {
    String s = "Class B";

    {
        System.out.println(super.s);
    }
}

class C extends B {
    String s = "Class C";

    {
        System.out.println(super.s);
    }
}

public class Q2 {

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.s);
    }
}