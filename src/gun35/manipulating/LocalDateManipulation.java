package gun35.manipulating;

import org.junit.Assert;
import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateManipulation {

    @Test
    public void testPlus() {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate actual = today.plusDays(1).plusMonths(1).plusYears(1);
        Assert.assertEquals("2022-01-06", actual.toString());
    }

    @Test
    public void testMinus() {
        LocalDate today = LocalDate.now();
        LocalDate actual = today.minusDays(1).minusMonths(1).minusYears(1);
        Assert.assertEquals("2019-11-04", actual.toString());
    }

    @Test
    public void testProjectDate() {
        LocalDate today = LocalDate.now();
        LocalDate projectDate = today.plusDays(7);

        System.out.println("This week project day is: " + projectDate);

        Assert.assertEquals(12, projectDate.getDayOfMonth());
        Assert.assertEquals(DayOfWeek.SATURDAY, projectDate.getDayOfWeek());
        Assert.assertEquals(Month.DECEMBER, projectDate.getMonth());
        Assert.assertEquals(2020, projectDate.getYear());

    }
}
