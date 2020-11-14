package gun28.tasks.task2;

public class Rectangle {
    int length;
    int width;

    int getPerimeter() {
        return (length + width) * 2;
    }
    // create method to calculate area of rectangle
    public int getArea() {
        return length * width;
    }
    // create method to print attributes
    public void printAttributes() {
        System.out.println("Length: " + length +
                "\nWidth: " + width);
    }
    //to get string representation of instance
    // you need to create method below
    public String toString() {
        return "{length=" + length + ", width=" + width + "}";
    }
}
