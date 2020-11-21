package gun30.example.example2;

public class Car {
    String model;

    public Car() {
    }

    public Car(String m) {
        this.model = m;
    }

    public void printMyCar() {
        String model = "My car model";
        System.out.println("Model: " + this.model);
    }
}