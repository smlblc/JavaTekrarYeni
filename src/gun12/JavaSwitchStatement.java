package gun12;

import java.util.Random;

public class JavaSwitchStatement {

    //switch

    public static void main(String[] args) {
        Random random = new Random();
        int day = 1 + random.nextInt( 7 ); // 1 - 7
//        int day = 1;
        System.out.println( "Your day is: " + day );

        switch(day) {
            case 1: // if day == 1
                System.out.println( "Monday" );
                break;
            case 2:// if day == 2
                System.out.println( "Tuesday" );
                break;
            case 3:// if day == 3
                System.out.println( "Wednesday" );
                break;
            case 4:// if day == 4
                System.out.println( "Thursday" );
                break;
            case 5:// if day == 5
                System.out.println( "Friday" );
                break;
            case 6:// if day == 6
                System.out.println( "Saturday" );
                break;
            case 7:// if day == 7
                System.out.println( "Sunday" );
                break;
            default:// else
                System.out.println( "not a valid day number" );
                break;
        }

    }

}
