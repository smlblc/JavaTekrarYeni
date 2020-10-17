package gun16;

public class JavaArrayEx1 {

    public static void main(String[] args) {

        //int array
        int intArray2[]; // don't write like this

        // you can create array in one line
        int[] arr = new int[10];

        // you can declare array and then initialize it
        int[] intArray;
        intArray = new int[5];

        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
//        intArray[3] = 40; out of bound, dont have such index

        //to get length of your array
        System.out.println( "Length: " + intArray.length );


        //hardcode
//        System.out.println( "value at index 0: " + intArray[0] );
//        System.out.println( "value at index 1: " + intArray[1] );
//        System.out.println( "value at index 2: " + intArray[2] );


        // adding more elements
        intArray[3] = 40;
        intArray[4] = 50;

        // 0 1 2 3 4
        //best way
        for(int i = 0; i < intArray.length; i++) {
            System.out.println( intArray[i] );
        }


    }

}
