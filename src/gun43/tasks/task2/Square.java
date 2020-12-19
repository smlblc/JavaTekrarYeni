package gun43.tasks.task2;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return "\nSquare" +
                "\nside: " + getWidth() +
                "\narea: " + getArea() +
                "\nperimeter: " + getPerimeter() ;
    }
}
