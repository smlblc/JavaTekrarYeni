package gun12;

public class JavaNestedIfStatement {

    public static void main(String[] args) {
//        int age = 70;
//
//        if(age > 18) {
//            System.out.println( "has permit to work" );
//            if(age > 60) {
//                System.out.println( "Too old to do some work" );
//            }
//        }
//        else {
//            System.out.println("Too young to do anything");
//        }


        int num = 10;

        if(num < 100) {
            System.out.println( "number is less than 100" );

            if(num > 50) {
                System.out.println( "number is greater than 50" );
            }

        }

    }

}
