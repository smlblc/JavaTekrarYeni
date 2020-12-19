package gun44.superConstructor;

public class App {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        Car car = new Car();

        System.out.println("--------");

        Car car2 = new Car(1,2);

        Car car3 = new Car("ek");


    }

}
