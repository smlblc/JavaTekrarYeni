package gun11;

public class JavaTernaryOperator {

    /*
    Ternary operator     ? :
     */

    public static void main(String[] args) {
        int speed = 40;

        int fine;

//        if(speed > 25) {
//            fine = 5;
//        } else {
//            fine = 0;
//        }

        fine = speed > 25 ? 5 : 0;    // durum ? durum dogru ise : durum yanlis ise
        //syntax
        // variable = (condition) ? true output : false output

        // variable = durum1 ? (durum2 ? 1 ve2 dogru : 1 dogru 2 yanlis) : 1 yanlis

        System.out.println( "Fine is: " + fine );


        String str = "".isEmpty() ? "string is empty" : "its not empty";
        System.out.println( str );

    }

}
