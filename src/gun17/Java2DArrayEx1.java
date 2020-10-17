package gun17;

public class Java2DArrayEx1 {

    public static void main(String[] args) {
        String[] comics = {"Marvel", "DC"};
        String[] fiction = {"The Lord of the rings", "Star war", "Harry Potter"};
        String[] classics = {"War and peace", "Anna Karenina", "Faust"};
        String[] horror = {"Saw", "Sinister", "Friday 13"};

//        //2D array when you dont know
        String[][] array2D = new String[4][3];

        //2D array when you know what values you have;
        String[][] books = {
                {"Marvel", "DC"},
                {"The Lord of the rings", "Star war", "Harry Potter"},
                {"War and peace", "Anna Karenina", "Faust"},
                {"Saw"}
        };

        //count of rows
//        System.out.println( "rows: " + books.length );
//        System.out.println( "at row index 0 we have column count: " + books[0].length);
//        System.out.println( "at row index 3 we have column count: " + books[3].length);



        //how to access to 2D array
//        System.out.println(books[0][0]);
//        System.out.println(books[0][1]);
//        System.out.println(books[1][0]);
//        System.out.println(books[1][1]);
//        System.out.println(books[1][2]);


        int totalCount = 0;
        //using nested loops
        for(int row = 0; row < books.length; row++) {
//            System.out.println( Arrays.toString(books[row]));
            for(int col = 0; col < books[row].length; col++) {
                System.out.println( books[row][col] );
                totalCount++;
            }
        }

        System.out.println( "Total Count of Books: " + totalCount );



    }

}
