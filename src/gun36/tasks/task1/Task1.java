package gun36.tasks.task1;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;

public class Task1 {

    //Write a Java method to calculate the difference between two dates
    public Period differenceOfTwoDates(LocalDate date1, LocalDate date2) {
//        if(date1.isBefore(date2)) {
//            return Period.between(date1, date2);
//        } else {
//            return Period.between(date2, date1);
//        }
        return date1.isBefore(date2) ? Period.between(date1, date2) : Period.between(date2, date1);
    }

    @Test
    public void testDifferenceOfTwoDates() {
        //Task1 t = new Task1();
        LocalDate d1 = LocalDate.of(2020, 12, 1);
        LocalDate d2 = LocalDate.now();
        Period period = differenceOfTwoDates(d2, d1);

        Assert.assertEquals(4, period.getDays());
    }


    public int getAge(LocalDate dob) {

        LocalDate today = LocalDate.now();
        return today.getYear() - dob.getYear();
    }

    @Test
    public void testGetAge(){
        LocalDate dob = LocalDate.of(1970, 3, 15);
        int age = getAge(dob);

        Assert.assertEquals(50, age);
    }
}
