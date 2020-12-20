package gun47.abstractKeyword.ex1;


//making class abstract
public abstract class Shape {

    //abstract class can have constructor
    public Shape(){


    }



    public abstract double getArea();


    //you can have non-abstract methods in abstract class
    public String toString() {
        return "\n"
                + getClass().getSimpleName()
                + "\nArea: " + getArea();

    }

    //you can create final methods in abstract class
    public final String getName(){
        return "My name is TS";
    }


    //you can have static methods in abstract class
    public static void draw(){
        System.out.println("Drawing a shape");
    }
}
