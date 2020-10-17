package gun16;

public class JavaForEachEx1 {

    public static void main(String[] args) {
//        String[] names = new String[5];
//        System.out.println( "names: " + Arrays.toString( names ) );
//
        int[] numbers = new int[5];

        for(int n : numbers) {
            System.out.println( n );
        }

    }

}
