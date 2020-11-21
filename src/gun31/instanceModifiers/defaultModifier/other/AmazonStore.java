package gun31.instanceModifiers.defaultModifier.other;

import gun31.instanceModifiers.defaultModifier.same.Book;

public class AmazonStore {

    public static void main(String[] args) {
        // cannot change/use package-private constructor in different package
        //Book book1 = new Book();

        // cannot change/use package-private field in different package
        // book1.name = "Lord Of The Rings";

        Book book2 = new Book("Faust");
    }
}
