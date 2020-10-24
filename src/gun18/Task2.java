package gun18;

public class Task2 {

    public static void main(String[] args) {
        String[][] array = {
                {"apple", "lemon", "peach"}, // 0
                {"green", "yellow", "red"},    //1
        };

        System.out.print( array[0][0] + " " );
        System.out.print( array[1][0] + " " );
        System.out.println();
        System.out.print( array[0][1] + " " );
        System.out.print( array[1][1] + " " );
        System.out.println();
        System.out.print( array[0][2] + " " );
        System.out.print( array[1][2] + " " );
        System.out.println( "\n-----------------\n" );

        for(int col = 0; col < array[0].length; col++) {
            for(int row = 0; row < array.length; row++) {
                System.out.print( array[row][col] + " " );
            }
            System.out.println();
        }
    }

}
