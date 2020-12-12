package gun35;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ComparingDateAndTime {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);

        boolean after = today.isAfter(yesterday);
        System.out.println(after);
        boolean before = today.isBefore(yesterday);
        System.out.println(before);
        boolean equal = today.isEqual(yesterday);
        System.out.println(equal);
        boolean leapYear = today.isLeapYear();
        System.out.println(leapYear);


        LocalTime time = LocalTime.now();
//        time.isBefore()
//        time.isAfter()

        LocalDateTime localDateTime = LocalDateTime.now();
//        localDateTime.isAfter()
//        localDateTime.isBefore()
//        localDateTime.isEqual()

    }
}
