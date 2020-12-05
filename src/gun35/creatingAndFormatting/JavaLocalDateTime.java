package gun35.creatingAndFormatting;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalDateTime {
    //LocalDateTime - Contains both a date and time but no time zone.(00:00 01/01/2021 new year, 20:10 05/11/2020 iftar)

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate localDate1 = LocalDate.of(2020, 05, 24);
        LocalTime localTime1 = LocalTime.of(0, 0);
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate1, localTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(2021, 01, 01, 0, 0);//new year date for 2021

        int year = localDateTime.getYear();
        System.out.println(year);

        Month month = localDateTime.getMonth();
        System.out.println(month);
        int monthValue = localDateTime.getMonthValue();
        System.out.println(monthValue);

        int dayOfYear = localDateTime.getDayOfYear();
        System.out.println(dayOfYear);
        int dayOfMonth = localDateTime.getDayOfMonth();
        System.out.println(dayOfMonth);
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println(dayOfWeek);

        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();
        System.out.println("Hour: "+ hour + " Minute: "+ minute +" Second: " +second );


        System.out.println("Short DateTime: " + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println("Medium DateTime: " + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
//        System.out.println("Long DateTime: " + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
//        System.out.println("Full DateTime: " + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));

        System.out.println("HH:mm MM dd yyy: " + localDateTime.format(DateTimeFormatter.ofPattern("HH:mm MM dd yyy")));

    }

}
