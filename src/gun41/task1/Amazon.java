package gun41.task1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Amazon {

    /*
    Mark Twain: Five Novels (Leather-bound Classics)
    by Mark Twain and Elizabeth Boyle Machlan PhD | Nov 1, 2011
    Leather Bound $16.69
    Hardcover $10.49
    Audible Audiobook $0.00


    Jane Austen: The Complete Works 7-Book Boxed Set: Classics hardcover boxed set (Penguin Clothbound Classics)
    by Jane Austen and Coralie Bickford-Smith | Nov 24, 2015
    Hardcover $109.61

    Little Women (Puffin in Bloom)
    by Louisa May Alcott  | Aug 28, 2014
    Hardcover $11.99
    Audible Audiobook $0.00
     */
    public ArrayList<Book> getClassicBooks() {
        ArrayList<Book> books = new ArrayList<>();
        //LocalDate publishDate = LocalDate.of(2011, Month.NOVEMBER, 1);
        Book book1 = new Book("Mark Twain: Five Novels (Leather-bound Classics)",
                "Mark Twain and Elizabeth Boyle Machlan PhD",
                LocalDate.of(2011, Month.NOVEMBER, 1),
                16.69,
                10.49,
                0.00);

//        Book book5 = new Book("Jane Austen: The Complete Works 7-Book Boxed Set: Classics hardcover boxed set (Penguin Clothbound Classics)",
//                "Jane Austen and Coralie Bickford-Smith",
//                LocalDate.of(2015, Month.NOVEMBER, 24),
//                null,
//                109.61,
//                null
//        );

        Book book2 = new Book("Jane Austen: The Complete ",
                "Jane Austen",
                LocalDate.of(2015, Month.NOVEMBER, 24)
        );
        book2.setHardCoverPrice(109.61);


        Book book3 = new Book();
        book3.setName("Little Women (Puffin in Bloom)");
        book3.setAuthor("Louisa May Alcott");
        //Aug 28, 2014
        book3.setPublishedDate(LocalDate.of(2014, Month.AUGUST, 28));
        book3.setHardCoverPrice(11.99);
        book3.setAudioBookPrice(0.00);


        books.add(book1);
        books.add(book2);
        books.add(book3);
        return books;
    }

    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        ArrayList<Book> classicBooks = amazon.getClassicBooks();
        for(Book classicBook : classicBooks) {
            System.out.println(classicBook);
        }
    }
}
