package gun31.instanceModifiers.protectedModifier.same;

public class Book {
    //protected access modifier field/instance variable
    protected String name;

    //protected constructor
    protected Book() {}

    public Book(String name) {
        this.name = name;
    }

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    //protected method
    protected void print() {
        System.out.println(toString());
    }
}
