package gun30.example.example3;

import org.junit.Assert;
import org.junit.Test;

public class JavaJUnit {


    @Test
    public void testGetArea() {
        Rectangle rect1 = new Rectangle(5, 10);
        int actualArea = rect1.getArea();

        Assert.assertEquals("getArea method is not correct", 50, actualArea);
    }

    @Test
    public void testSum() {
        int sum = 10 + 10;

        Assert.assertEquals(20, sum);
    }

    @Test
    public void testTrue() {
        boolean actual = "Elma is good".contains("Elma"); //(true && true) || (false && true);

        Assert.assertTrue(actual);
//        Assert.assertEquals(true, actual);
    }

    @Test
    public void testNull() {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2= null;

        Assert.assertNotNull("Maybe you forget to initialize rect1", rect1);

        int actualArea = rect1.getArea();
    }


}
