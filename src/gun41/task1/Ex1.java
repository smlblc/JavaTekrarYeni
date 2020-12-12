package gun41.task1;

import org.junit.Assert;
import org.junit.Test;

public class Ex1 {
    /*
     Test if your Book class works correctly, add test cases for hasThreePrices()
    a. add case where it returns true
    b. add case where it returns false
     */

    @Test
    public void testHasThreePrices_success() {
        Book book = new Book();
        book.setName("Life of QA");
        book.setAuthor("Yusuf Esenboga");
        book.setLeatherBoundPrice(100.0);
        book.setHardCoverPrice(80.0);
        book.setAudioBookPrice(0.0);
        boolean actual = book.hasThreePrices();

        Assert.assertTrue(actual);
    }

    @Test
    public void testHasThreePrices_fail() {
        Book book = new Book();
        book.setName("Life of QA");
        book.setAuthor("Yusuf Esenboga");
        book.setLeatherBoundPrice(100.0);

        boolean actual = book.hasThreePrices();

        Assert.assertFalse(actual);
    }
}
