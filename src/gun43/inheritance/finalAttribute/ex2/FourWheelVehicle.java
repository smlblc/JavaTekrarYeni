package gun43.inheritance.finalAttribute.ex2;

public class FourWheelVehicle {
    public final String model;
    public final int wheelCount = 4;

    public FourWheelVehicle(String model) {
        this.model = model;
    }

    public final void print() {
        System.out.println(model);
    }

}
