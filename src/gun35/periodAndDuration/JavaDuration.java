package gun35.periodAndDuration;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.TemporalUnit;
import java.util.List;

public class JavaDuration {

    public static void main(String[] args) {
        LocalTime midnight = LocalTime.of(0, 0);
        LocalTime onePM = LocalTime.of(13, 0);

        Duration between = Duration.between(midnight, onePM);
        long seconds = between.getSeconds();
        long nano = between.getNano();
        List<TemporalUnit> units = between.getUnits();
        long hour = between.toHours();
        System.out.println(seconds);
        System.out.println(nano);
        System.out.println(units);
        System.out.println("\n" + between);
        System.out.println(hour);

        Duration durationJavaCourse = Duration.ofHours(3);

        LocalTime startOfJavaCourse = LocalTime.of(21, 00);
        LocalTime endOfJavaCourse = startOfJavaCourse.plus(durationJavaCourse);
        System.out.println(endOfJavaCourse);

    }
}
