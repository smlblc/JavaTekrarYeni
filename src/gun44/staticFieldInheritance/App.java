package gun44.staticFieldInheritance;

public class App {

    public static void main(String[] args) {
//        A a = new A();
//        System.out.println("1. from A: " + A.text );
//        System.out.println(a);

        B b = new B();
        System.out.println("from B: " + B.text);

        System.out.println("2. from A: " + A.text);

    }

}
/*
1st instance init
2nd instance init
1st static init
2nd static init
NO Argument Cons
One Argument Cons


 */
