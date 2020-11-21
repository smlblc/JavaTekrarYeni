package gun31.instanceModifiers.protectedModifier.other;

import gun31.instanceModifiers.protectedModifier.same.Book;

public class AmazonStore {

    public static void main(String[] args) {
        // protected access modified cannot be used/called from different package
//       Book book1 = new Book();
//        book1.name = "Lord Of The Rings";
//        book1.print();

        Book book2 = new Book("Effective Java");
    }
}
