package gun31.instanceModifiers.protectedModifier.same;

public class BookStore {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Lord Of The Rings";
        book1.print();

        Book book2 = new Book("Effective Java");
        book2.print();
    }
}
