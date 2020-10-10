package gun13;

import java.util.Scanner;

public class JavaWhileEx4 {

    // write program which checks if provide hacking code is correct
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );
        System.out.println("Write hacking code");
        int hackCode = input.nextInt();

        while(hackCode == 9999){
            System.out.println("reaching secret data");
            hackCode = input.nextInt();
        }

    }

}
