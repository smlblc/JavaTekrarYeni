package gun35;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringToLocalDateAndTime {

    public static void main(String[] args) {
        String strDate = "01 25 2020";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");

        LocalDate localDate = LocalDate.parse(strDate, formatter);
        System.out.println(localDate);

//        localTime = LocalTime.of(19, 00);
//        System.out.println("hh:mm:ss a->" + localTime.format(DateTimeFormatter.ofPattern("hh:mm:ss a")));

        String strTime = "11:49 PM";
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime localTime = LocalTime.parse(strTime, formatTime);
        System.out.println(localTime);



    }
}
