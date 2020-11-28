package gun35.manipulating;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTask {
    //using date time as: May 11 2020, 15:00

    //1. test with plus year, month, day, minute and hour
    //2. test with minus year, month, day, minute and hour

    @Test
    public void testPlus() {
        LocalDateTime dateTime = LocalDateTime.of(2020, 5, 11, 15, 0);
        LocalDateTime actualDateTime = dateTime.plusYears(1).plusMonths(1).plusDays(1).plusHours(1).plusMinutes(1);

        String actual = actualDateTime.format(DateTimeFormatter.ofPattern("HH:mm MM dd yyy"));
        String expected = "16:01 06 12 2021";
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testMinus() {
        LocalDateTime dateTime = LocalDateTime.of(2020, Month.MAY, 11, 15, 0);
        LocalDateTime actualDateTime = dateTime.minusYears(1).minusMonths(1).minusDays(1) //
                .minusHours(1).minusMinutes(1);

        String actual = actualDateTime.format(DateTimeFormatter.ofPattern("HH:mm MM dd yyy"));
        String expected = "13:59 04 10 2019";
        Assert.assertEquals(expected, actual);
    }
}
