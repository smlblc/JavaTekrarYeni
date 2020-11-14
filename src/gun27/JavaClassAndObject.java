package gun27;

public class JavaClassAndObject {

    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.model = "Toyota Camry";
        toyota.manufactureDate = 2020;
        toyota.motorSize = 2.4;

        System.out.println("Model: " +  toyota.model);
        System.out.println("Manufacture Date: " +  toyota.manufactureDate);
        System.out.println("Motor Size: " +  toyota.motorSize);
    }
}

class Car {
    // attributes/fields/instance variables
    String model;
    int manufactureDate;
    double motorSize;
}
