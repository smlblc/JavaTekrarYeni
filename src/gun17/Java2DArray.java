package gun17;

public class Java2DArray {

    //    bookstore
    public static void main(String[] args) {
        String[] comics = {"Marvel", "DC"};
        String[] fiction = {"The Lord of the rings", "Star war", "Harry Potter"};
        String[] classics = {"War and peace", "Anna Karenina", "Faust"};
        String[] horror = {"Saw", "Sinister", "Friday 13"};

        //example total count of books
        int totalCount = 0;
        for(String comic : comics) {
            totalCount++;
        }
        for(String s : fiction) {
            totalCount++;
        }
        for(String classic : classics) {
            totalCount++;
        }
        for(String h : horror){
            totalCount++;
        }

        System.out.println( "Total Count of Books: " + totalCount );


    }

}
