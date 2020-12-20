package gun45.initializerBlock;

public class School {

    //this code will execute before every constructor call
    {
        System.out.println("Initializer Block");
    }

    //this code will execute before every constructor call
    {
        System.out.println("Initializer Block 1");
    }

    public School(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("main");

        new School();
    }

    //this code will execute before every constructor call
    {
        System.out.println("Initializer Block 2");
    }

}
