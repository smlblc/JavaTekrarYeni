package gun18;

public class JavaFormattedPrint {

    public static void main(String[] args) {
        double price = 1.333333;

        System.out.println( price );

        System.out.println( String.format ( "%.2f", price ) );
    }

}
