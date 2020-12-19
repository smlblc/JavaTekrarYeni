package gun43.tasks.task2;

public class Shape {

    @Override
    public String toString() {
        return "Shape{ no data here }";
    }

    public double getArea() {
        //new UnsupportedOperationException();
        throw new RuntimeException("Not Implemented");
    }

    public double getPerimeter() {
        throw new RuntimeException("Not Implemented");
    }
}
