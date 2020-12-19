package gun43.tasks.task2;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }



    @Override
    public double getArea() {
        return length * width;
    }


    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "\nRectangle" +
                "\nwidth: " + width +
                "\nlength: " + length +
                "\narea: " + getArea() +
                "\nperimeter: " + getPerimeter() ;
    }
}
