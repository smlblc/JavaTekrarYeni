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
        LocalDate actual = today.plusDays(1).plusMonths(1).plusYears(1);
        Assert.assertEquals("2021-06-12", actual.toString());
    }

    @Test
    public void testMinus() {
        LocalDate today = LocalDate.now();
        LocalDate actual = today.minusDays(1).minusMonths(1).minusYears(1);
        Assert.assertEquals("2019-04-10", actual.toString());
    }

    @Test
    public void testProjectDate() {
        LocalDate today = LocalDate.now();
        LocalDate projectDate = today.plusDays(5);

        System.out.println("This week project day is: " + projectDate);

        Assert.assertEquals(16, projectDate.getDayOfMonth());
        Assert.assertEquals(DayOfWeek.SATURDAY, projectDate.getDayOfWeek());
        Assert.assertEquals(Month.MAY, projectDate.getMonth());
        Assert.assertEquals(2020, projectDate.getYear());

    }
}
