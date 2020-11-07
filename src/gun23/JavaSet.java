package gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class JavaSet {

    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);

        System.out.println(list);

        // Set<Integer> set = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        boolean add_1 = set.add(1);
        boolean add_2 = set.add(2);
        boolean add_3 = set.add(3);
        boolean add_3_again = set.add(3);
        boolean add_2_again = set.add(2);

        System.out.println(set);
    }

}
