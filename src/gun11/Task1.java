package gun11;

public class Task1 {
    // generate a number between min:5 and max:10
/*
        int min = 5;
        int max = 10;
        int numberInRange = (int) (Math.random() * ((max - min) + 1)) + min;
 */
    public static void main(String[] args) {


        // random number between 0 - 10
        int num = (int) (Math.random() * 10);
        System.out.println( "random number: " + num );


        //


        int num2 = (int) (Math.random() * 6) + 5;
        System.out.println( "random number2: " + num2 );


    }

}
