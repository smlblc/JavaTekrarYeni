package gun43.tasks.task1;

public class Parking {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        System.out.println(car1);

        Car car2 = new Car("Ford");
        System.out.println(car2);

        Truck truck1 = new Truck("Dodge");
        System.out.println(truck1);

        Truck truck2 = new Truck("Ford");
        System.out.println(truck2);
    }
}
