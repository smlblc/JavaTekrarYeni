package gun32.nonAccessModifier.staticModifier;

public class Person {
    String name;
    static String planetName;

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Planet: " + planetName);
        System.out.println();
    }


    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John";
        Person.planetName = "Earth";
        person1.print();

        Person person2 = new Person();
        person2.name = "Alice";
        Person.planetName = "Mars";
        person2.print();

        System.out.println("After expedition");
        person1.print();
        person2.print();


    }
}
