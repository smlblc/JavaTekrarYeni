package gun18;

public class Java2DArrayEx2 {
    //item prices

    //         Costco  Walmart  Aldii  Average
    // water   $0.25   $0.27    $0.30   $0.27
    // bread   $0.70   $0.40    $1.05   $0.72
    // meat    $7.35   $9.99    $7.30   $8.21

    public static void main(String[] args) {
        String[] markets = {"Costco", "Walmart", "Aldii"};
        String[] items = {"Water", "Bread", " Meat"};
        double[][] itemPrices = {
                {0.25, 0.27, 0.30},
                {0.70, 0.40, 1.05},
                {7.35, 9.99, 7.30}
        };

        //part 1. print all items
        //
        // $0.25   $0.27    $0.30
        // $0.70   $0.40    $1.05
        // $7.35   $9.99    $7.30

        for(int row = 0; row < 3; row++) {
            for(int col = 0; col < 3; col++) {
                System.out.print( "$" + itemPrices[row][col] + "\t" );
            }
            System.out.println();


        }
        //to print in formatted manner
        System.out.printf( "%.3f\n", 0.3333333333 );
        System.out.println( String.format( "%.2f", 0.3333333333 ) );

        //part 2. calculate average of
        //         Costco  Walmart  Aldii   AVG
        // water   $0.25   $0.27    $0.30   $0.27
        // bread   $0.70   $0.40    $1.05   $0.72
        // meat    $7.35   $9.99    $7.30   $8.21
        for(int row = 0; row < 3; row++) {
            double sum = 0;
            for(int col = 0; col < 3; col++) {
                sum += itemPrices[row][col];
                System.out.print( "$" + itemPrices[row][col] + "\t" );
            }
            double avg = (sum / 3);
            System.out.println( "  Avg: " + String.format( "$%.2f", avg ) );
        }

    }

}
