package gun12;

public class JavaIfElseIfLadderStatement {

    public static void main(String[] args) {

        int age = 20;

        if(age > 10) {
            System.out.println( "age is greater than 10" );
        } else if(age > 15) {
            System.out.println( "age is greater than 15" );
        } else if(age == 20) {
            System.out.println( "age is equal to 20" );
        } else {
            System.out.println( "out of range" );
        }

    }

}
