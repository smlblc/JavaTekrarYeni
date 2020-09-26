package gun12;

import java.util.Random;

public class Task1 {
    /*
    Write a Java program to evaluate exam result of student
    ex:
    'A'-> Excellent!!!
    'B'-> Well done
    'C'-> Good
    'D'-> Need improvement
    'F'-> Fail
     */

    // part 2 , try to use switch statement instead of if-else-if

    public static void main(String[] args) {
        //with scanner
//        Scanner scan = new Scanner( System.in );
//        System.out.print( "Provide exam result of student[A, B, C, D, F]: " );
//        String examResult = scan.nextLine();

        //with random     012345
        String results = "ABCDF#";
        Random rand = new Random();
        char letter = results.charAt( rand.nextInt( 6 ) );

        System.out.print( "Provide exam result of student[A, B, C, D, F]: " );
        String examResult = letter + ""; //String.valueOf(  ); Character.toString(  );
        System.out.println( examResult );

        if(examResult.equals( "A" )) {
            System.out.println( "Excellent!!!" );
        } else if(examResult.equals( "B" )) {
            System.out.println( "Well done" );
        } else if(examResult.equals( "C" )) {
            System.out.println( "Good" );
        } else if(examResult.equals( "D" )) {
            System.out.println( "Need improvement" );
        } else if(examResult.equals( "F" )) {
            System.out.println( "Fail" );
        } else {
            System.out.println( "Not valid input!!!" );
        }

        //part2
        //Scanner scanner = new Scanner(System.in);
        //        System.out.print("Exam = ");
        //        String exam=scanner.nextLine();
        //        switch(exam) {
        //            case "A":
        //                System.out.println( "Excellent!!!" );
        //                break;
        //            case "B":
        //                System.out.println( "Well done" );
        //                break;
        //            case "C":
        //                System.out.println( "Good" );
        //                break;
        //            case "D":
        //                System.out.println( "Need improvement" );
        //                break;
        //            case "F":
        //                System.out.println( "Fail" );
        //                break;
        //            default:
        //                System.out.println( "Not valid input!!!" );
        //                break;
        //        }


    }
}
