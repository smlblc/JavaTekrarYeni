package gun35.creatingAndFormatting;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalDate {

    public static void main(String[] args) {
        // LocalDate - Contains just a date, no time and no time zone. (19/12/1989, birthday this year)
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2020, 05, 24);
        System.out.println(localDate1);
        LocalDate localDate2 = LocalDate.of(2020, Month.MAY, 24);
        System.out.println(localDate2);

        int dayOfMonth = localDate.getDayOfMonth();
        System.out.println(dayOfMonth);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        int dayOfYear = localDate.getDayOfYear();
        System.out.println(dayOfYear);

        Month month = localDate.getMonth();
        System.out.println(month);

        int monthValue = localDate.getMonthValue();
        System.out.println(monthValue);

        int year = localDate.getYear();
        System.out.println(year);

        System.out.println("Short Date: " + localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("Medium Date: " + localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("Long Date: " + localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("Full Date: " + localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("MM dd yyy: " + localDate.format(DateTimeFormatter.ofPattern("yyyy:MM:dd")));

//
//        //just fyi coders/programmes/ developers day => 256th of year


    }
}
