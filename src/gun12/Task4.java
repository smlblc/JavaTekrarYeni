package gun12;

import java.util.Scanner;

public class Task4 {
    /*
    Write a Java program to input marks of five subjects
    Physics, Chemistry, Biology, Mathematics and Computer,
    calculate percentage and grade according to given conditions:

If percentage >= 90% : Grade A
If percentage >= 80% : Grade B
If percentage >= 70% : Grade C
If percentage >= 60% : Grade D
If percentage >= 40% : Grade E
If percentage < 40% : Grade F
     */

    //ex:
//    Physics: 90,
//    Chemistry: 50,
//    Biology: 77,
//    Mathematics: 95
//    Computer: 65
    //percentage = (90+50+77+95+65)/5 = 75.4

    //output => Grade C

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.print( "Physics: " );
        double physics = input.nextDouble();

        System.out.print( "Chemistry: " );
        double chemistry = input.nextDouble();

        System.out.print( "Biology: " );
        double biology = input.nextDouble();

        System.out.print( "Mathematics: " );
        double mathematics = input.nextDouble();

        System.out.print( "Computer: " );
        double computer = input.nextDouble();


        double percentage = (physics + chemistry + biology + mathematics + computer) / 5;


        String grade = "Grade ";
        if(percentage >= 90) {
            grade = grade + "A";
        } else if(percentage >= 80) {
            grade = grade + "B";
        } else if(percentage >= 70) {
            grade += "C";
        } else if(percentage >= 60) {
            grade += "D";
        } else if(percentage >= 40) {
            grade += "E";
        } else if(percentage < 40) {
            grade += "F";
        }

        System.out.println( "Percentage: " + percentage );
        System.out.println( grade );

    }
}
