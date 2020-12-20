package gun47.abstractKeyword.ex2;

public abstract class A {

    public A(String name){
        System.out.println("Constructor of A");
    }
}

class B extends A {

    public B(String name) {
        super(name);
        System.out.println("Constructor of B");

    }


    public static void main(String[] args) {
        B b = new B("Techno");

        //cant create object of abstract class
        //A a = new A("Study");
    }
}
