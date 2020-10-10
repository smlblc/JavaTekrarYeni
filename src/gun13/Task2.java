package gun13;

import java.util.Scanner;

public class Task2 {
    // write a java program which read text from user
    // and prints it 5 times

    //input:     text:   Hi
    //output:    result: HiHiHiHiHi

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.println( "Write some text: " );
        String text = input.nextLine();

        String result = "";
        int i = 1;
        while(i <= 5) {
//            System.out.println( "i:" + i );
            result += text; //result = result + text;
            System.out.println( "result: " + result );

            //part2: print "world" if the length of result is greater than 5
            // code here
            if(result.length() > 5) {
                System.out.println( "world!!!" );
            }
            // end here

            i++;
        }

        System.out.println( result );

    }

}
