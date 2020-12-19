package gun43.tasks.task1;

public class Vehicle {
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Model is: " + model;
    }

}
