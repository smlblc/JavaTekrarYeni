package gun43.inheritance.finalAttribute.ex1;

public class Car extends Vehicle {

    public static void main(String[] args) {
        Car car1 = new Car();
        //car1.model = "Toyota"; cannot reassign final field
        System.out.println(car1.model);
    }
}
