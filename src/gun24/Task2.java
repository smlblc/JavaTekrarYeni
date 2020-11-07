package gun24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task2 {
    // create HashSet, TreeSet, LinkedHashSet of given integers and print them
    // [1, 6, 33, 15, 22, 7, 8, 4, 3, 6]

    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 6, 33, 15, 22, 7, 8, 4, 3, 6);
        ArrayList<Integer> list = generateNumbers();

        HashSet<Integer> hashSet = new HashSet<>(list);
        System.out.println("HashSet: " + hashSet);

        TreeSet<Integer> treeSet = new TreeSet<>(list);
        treeSet.add(-50);
        System.out.println("TreeSet: " + treeSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(list);
        linkedHashSet.add(-50);
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }

    private static ArrayList<Integer> generateNumbers() {
        ArrayList<Integer> result = new ArrayList<>();
        int[] numbers = {1, 6, 33, 15, 22, 7, 8, 4, 3, 6};
        for(int number : numbers) {
            result.add(number);
        }
        return result;
    }
}
