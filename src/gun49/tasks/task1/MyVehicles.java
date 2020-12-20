package gun49.tasks.task1;

import gun49.tasks.task1.interfaces.Flying;
import gun49.tasks.task1.interfaces.Vehicle;
import gun49.tasks.task1.vehicles.AirPlane;
import gun49.tasks.task1.vehicles.Car;
import gun49.tasks.task1.vehicles.SpaceShip;

import java.util.ArrayList;
import java.util.List;

public class MyVehicles {

    public static void main(String[] args) {
        Vehicle car = new Car();
        doubleSpeed(car);

        Vehicle airPlane = new AirPlane();
        doubleSpeed(airPlane);
        print((Flying) airPlane);

        Vehicle spaceShip = new SpaceShip();
        doubleSpeed(spaceShip);


        List<Integer> list = new ArrayList<>();
    }

    public static void doubleSpeed(Vehicle vehicle) {
        System.out.println(vehicle.getClass().getSimpleName()+ ", doubled speed is: " + vehicle.speed() * 2);
    }

    public static void print(Flying flying){
        System.out.println("This vehicle fly on: " + flying.fly());
    }


    public static void option1() {
        Car car = new Car();
        AirPlane airPlane = new AirPlane();
        SpaceShip spaceShip = new SpaceShip();
    }
}
