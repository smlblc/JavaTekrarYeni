package gun16;

import java.util.Arrays;

public class JavaForEach {

    public static void main(String[] args) {
        String[] animals = {"cat", "dog", "bird"};
        for(String animal : animals) {
            System.out.println( animal );
        }
        System.out.println("---------------------");
        System.out.println(Arrays.toString(animals));

    }

}
