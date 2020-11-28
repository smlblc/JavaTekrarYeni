package gun32.tasks.task1;

import java.util.Arrays;

public class Task1 {
    static final String[] months = {
            "January", "February",
            "March", "April", "May",
            "June", "July", "August",
            "September", "October", "November",
            "December"};

    public static void main(String[] args) {
        System.out.println("Before change: " + Arrays.toString(months));

        months[0] = "Winter month1";
        months[1] = "Winter month2";
        months[2] = "Winter month3";
        months[3] = "Month4";
        months[4] = "Month5";
        months[5] = "Month6";
        months[6] = "Month7";
        months[7] = "Month8";
        months[8] = "Month9";
        months[9] = "Month10";
        months[10] = "Month11";
        months[11] = "Month12";

        System.out.println("After change: " + Arrays.toString(months));

        //changing String[] months
        //months = new String[]{"Winter", "Summer", "Autumn", "Spring"};
    }
}
