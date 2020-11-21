package gun31.instanceModifiers.defaultModifier.same;

public class Book {
    //default/package-private access modifier
    String name; // public degil

    Book(){
    }

    public Book(String name){
        this.name = name;
    }
}
