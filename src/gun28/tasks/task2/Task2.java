package gun28.tasks.task2;

public class Task2 {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 5;
        rectangle1.length = 10;

        String output = "Perimeter: " + rectangle1.getPerimeter();
        System.out.println(output);

        System.out.println("Area: " + rectangle1.getArea());

        System.out.println(rectangle1);
    }
    
}
