package gun36;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class DateConvert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter desired date(M/d/yy):");
        String text = scanner.nextLine();

        LocalDate date = LocalDate.parse(text, DateTimeFormatter.ofPattern("M/d/yy"));

        System.out.println("converted to LocalDate: " + date);

    }
}
