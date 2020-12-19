package gun44.superConstructor;

/*
invoke the superclass constructor
from subclass.
 */
public class Car extends Vehicle {

    public Car(){
        //super("calling from Car");
        //super(); // this code is called by default
        System.out.println("Car default constructor");
    }

    public Car(int x, int y){
        super("calling from Car overloaded constructor");
        System.out.println("Car overloaded constructor"+x+""+y);
    }

    public Car(String str){
        //super(); //its here be default
        System.out.println("Car overloaded constructor_2_with_String"+str);
    }

}
