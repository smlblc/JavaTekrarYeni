package gun22;

import java.util.ArrayList;
import java.util.Collections;

public class JavaCollections {

    public static void main(String[] args) {

        // Collections.sort(); // to sort collection: arrayList, map, set
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(69);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        System.out.println("not sorted: " + numbers);
        Collections.sort(numbers);
        System.out.println("after sorted: " + numbers);


        // Collections.max() - to get maximum value in arrayList
        Integer max = Collections.max(numbers);
        System.out.println(max);

        // Collections.min() - get minimum value in arrayList
        Integer min = Collections.min(numbers);
        System.out.println(min);


        // Collections.reverse(); to reverse arrayList
        Collections.reverse(numbers);
        System.out.println("after reversed: " + numbers);


        // Collections.fill(); to fill out you arrayList
        Collections.fill(numbers, 101);
        System.out.println("after filled w/ 101: " + numbers);


        // Collections.replaceAll(); to replace some elements with new value
        Collections.replaceAll(numbers, 101, 5);
        System.out.println("after replacedAll w/ 5: " + numbers);


    }
}
