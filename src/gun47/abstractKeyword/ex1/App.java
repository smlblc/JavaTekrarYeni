package gun47.abstractKeyword.ex1;

public class App {

    public static void main(String[] args) {
        //Shape shape = new Shape(); // cannot create instance of abstract class


        //shape.getArea();
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println(rectangle);

        Circle circle = new Circle(2);
        System.out.println(circle);

        /*
        Rectangle
        Area: ....
         */

        /*
        Circle
        Area: ....
         */

    }
}
