package gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Task1 {
    //Create method that generates a HashSet of numbers [1, 2, 3, 4, 5, 5, 5, 6, 7, 8];
    public static HashSet<Integer> generateSet() {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(5);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);

        //2. way
        int[] numbers = {1, 2, 3, 4, 5, 5, 5, 6, 7, 8};
        for(int number : numbers) {
            set.add(number);
        }

        return set;
    }

    // create method with varargs to add elements to set
    // hint: varargs...
    // parameters: set, integers...
    public static void addElements(HashSet<Integer> set, Integer... values) {// Integer[] values
        for(Integer value : values) {
            set.add(value);
        }
    }

    // create method that prints set elements in separate lines
    public static void printSet(HashSet<Integer> set) {
        for(Integer integer : set) {
            System.out.println(integer);
        }
    }

    // create method that returns ArrayList from provided HashSet
    // Hint: method that converts HashSet to ArrayList
    public static ArrayList<Integer> convertToArrayList(HashSet<Integer> set) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for(Integer setInteger : set) {
//            list.add(setInteger);
//        }

        // 2. way
//         list.addAll(set);

        //3 ways. shorter
        ArrayList<Integer> list = new ArrayList<>(set);
        return list;
    }


    // create method that returns int[] from provided HashSet<Integer>
    // Hint: convert HashSet to array
    public static int[] convertToArray(HashSet<Integer> set) {
        int[] result = new int[set.size()];
        // 1. way
        int index = 0;
        for(Integer val : set) {
            result[index++] = val;
        }

//        // 2. way
//        ArrayList<Integer> list = convertToArrayList(set);
//        for(int i = 0; i < list.size(); i++) {
//            result[i] = list.get(i);
//        }
//
//        // 3. way // ???
//        Integer[] arrays = new Integer[set.size()];
//        set.toArray(arrays);  // ???

        return result;
    }


    public static void main(String[] args) {
        HashSet<Integer> numbers = generateSet();

        addElements(numbers, 100, 50, 15, 99, 69, 19);
        addElements(numbers, 100, 50);
        addElements(numbers, 1, 6, 10, 90);

        System.out.println(numbers);

        printSet(numbers);

        int[] ints = convertToArray(numbers);

        System.out.println(Arrays.toString(ints));
    }

}
