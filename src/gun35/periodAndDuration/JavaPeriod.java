package gun35.periodAndDuration;

import java.time.LocalDate;
import java.time.Period;

public class JavaPeriod {

    //Period class uses the units year, month and day to represent a period.
    //it can be used only for LocalDate and LocalDateTime
    public static void main(String[] args) {
        LocalDate newYear = LocalDate.of(2000, 1, 1);
        LocalDate today = LocalDate.now();

        Period between = Period.between(newYear, today);
        int years = between.getYears();
        int months = between.getMonths();
        int days = between.getDays();
        System.out.println(years);
        System.out.println(months);
        System.out.println(days);


        Period periodOf3days = Period.ofDays(3);
        Period quarterOfYear = Period.ofMonths(3);


        today.plus(periodOf3days);
        today.minus(quarterOfYear);


        LocalDate tsStart = LocalDate.of(2020,03,15);
        Period coursePeriod = Period.ofMonths(6);
        LocalDate tsEnd = tsStart.plus(coursePeriod);
        System.out.println(tsEnd.getDayOfWeek());
    }

}
