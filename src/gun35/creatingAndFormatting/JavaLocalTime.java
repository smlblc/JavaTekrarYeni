package gun35.creatingAndFormatting;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalTime {

    public static void main(String[] args) {
        // LocalTime - Contains just a time, no date and no time zone. (midnight, ts. morning class start time -> 9:00am)
        LocalTime localTime = LocalTime.now();

        LocalTime localTime1 = LocalTime.of(0, 0);
        LocalTime localTime2 = LocalTime.of(10, 0, 30);

        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();


        System.out.println("Short Time: " + localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        System.out.println("Medium Time: " + localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));

        // we dont have FormatStyle.LONG & FormatStyle.FULL for LocalTime
//        System.out.println("Long Time: " + localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG)));
//        System.out.println("Full Time: " + localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL)));

        localTime = LocalTime.of(19, 00);
        System.out.println("hh:mm:ss a->" + localTime.format(DateTimeFormatter.ofPattern("hh:mm:ss a")));

        DateTimeFormatter myCustomFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = localTime.format(myCustomFormat);
        System.out.println("24hour format HH:mm:ss ->" + formattedTime);


    }

}
