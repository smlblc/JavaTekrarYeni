package gun16;

import java.util.Arrays;

public class JavaForEachEx2 {

    public static void main(String[] args) {
        int[] array = new int[5];

        //you can't change value of your array using foreach loop
        // for each dongusunu kullanarak array degerlerini degistiremeyiz.
        for(int number : array) {
            number = 3;
            System.out.println( number );
        }

        System.out.println(Arrays.toString(array));

        // for i kullanarak array degerlerini assign edebiliriz.
        for (int i = 0; i <array.length ; i++) {
            array[i] = 3;
        }

        System.out.println(Arrays.toString(array));
    }

}
