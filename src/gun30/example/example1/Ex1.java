package gun30.example.example1;

class Book {
    String name;
    int publishYear;

    public Book() {
    }

    public Book(String name, int year) {
        this.name = name;
        publishYear = year;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + this.publishYear);
    }
}

public class Ex1 {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Harry Potter";
        book1.publishYear = 2001;
        book1.print();

        Book book2 = new Book("Java For Beginners", 1995);
        book2.print();


        String str = "";
        str = str;
    }
}
