package gun30.tasks.task2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/*
create class TestNumbers
create method to check "checkEvenNumber"
 */
public class TestNumbers {

    @Test
    public void testCheckEvenNumber_with_even() {
        Numbers nums = new Numbers();
        boolean actual = nums.checkEvenNumber(10);

        Assert.assertTrue(actual);
    }

    @Test
    public void testCheckEvenNumber_with_odd() {
        Numbers nums = new Numbers();
        boolean actual = nums.checkEvenNumber(3);
        Assert.assertFalse(actual);
    }

    @Test
    public void testCheckEvenNumber_with_negative_even() {
        Numbers nums = new Numbers();
        boolean actual = nums.checkEvenNumber(-2);
        Assert.assertTrue(actual);
    }

    @Test
    public void testCheckEvenNumber_with_negative_odd() {
        Numbers nums = new Numbers();
        boolean actual = nums.checkEvenNumber(-33);
        Assert.assertFalse(actual);
    }

    @Test
    public void testCheckEvenNumber_with_zero() {
        Numbers nums = new Numbers();
        boolean actual = nums.checkEvenNumber(0);
        Assert.assertTrue(actual);
    }

    @Test
    public void testEvenNumbers() {
        Numbers nums = new Numbers();
        ArrayList<Integer> list = nums.evenNumbers();
        Integer[] actual = new Integer[list.size()];
        actual = list.toArray(actual);

        Integer[] expected = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        Assert.assertArrayEquals(expected, actual);
    }

}
