package gun31.instanceModifiers.defaultModifier.same;

public class BookStore {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Lord Of The Rings";

        Book book2 = new Book("Effective Java");

    }
}
