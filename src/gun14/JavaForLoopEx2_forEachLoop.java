package gun14;

import java.util.ArrayList;

public class JavaForLoopEx2_forEachLoop {

    public static void main(String[] args) {
        // to print numbers from 10 to 0
        for(int i = 10; i >= 0; i--) {
            System.out.println( "i:" + i );
        }

        //for each

        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        for (String weekDay : weekDays) {
            System.out.println("Haftanin gunleri: "+weekDay +", Bu gunun harf uzunlugu: "+weekDay.length());
        }

        //OCA: Enhanced for loop : for Each Loop


    }

}
