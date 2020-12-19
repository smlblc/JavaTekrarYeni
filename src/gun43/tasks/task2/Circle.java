package gun43.tasks.task2;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        //π(r*r)
        return Math.PI * (radius * radius);
    }

    @Override
    public double getPerimeter() {
        //C=2πr
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "\nCircle" +
                "\nradius: " + radius +
                "\narea: " + getArea() +
                "\nperimeter: " + getPerimeter() ;
    }
}
