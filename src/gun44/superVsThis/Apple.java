package gun44.superVsThis;

/*
differentiate the members of superclass
from the members of subclass,
if they have same names.
 */
public class Apple extends Fruit {

    public String name;

    public Apple() {
        this.name = "Apple";
        super.name = "Fruit";
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                "Father name='" + super.name+ '\'' +
                '}';
    }

    public static void main(String[] args) {
       Apple a = new Apple();
        System.out.println(a);
    }
}
