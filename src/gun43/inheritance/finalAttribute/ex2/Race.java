package gun43.inheritance.finalAttribute.ex2;

public class Race {

    public static void main(String[] args) {
        Car car1 = new Car("Ford");
        car1.print();
//        car1.model = "Fordik"; cannot change final field
//        car1.wheelCount = 3; cannot change final field

        F1 f1Vehicle = new F1("McLaren");
        f1Vehicle.print();
    }
}
