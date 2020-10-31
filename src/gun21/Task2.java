package gun21;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    // create a method that will fill arrayList of integers with random numbers
    public static ArrayList<Integer> generateListOfRandomNumbers() {
        ArrayList<Integer> list = new ArrayList<>();

        Random random = new Random();
        list.add(random.nextInt(5));
        list.add(random.nextInt(5));
        list.add(random.nextInt(5));
        list.add(random.nextInt(5));

        return list;
    }

    // create a method that will update first element in arrayList
    public static void updateFirstElement(ArrayList<Integer> list, int element) {
        list.set(0, element);
    }


    public static void main(String[] args) {

        ArrayList<Integer> list = generateListOfRandomNumbers();
        System.out.println(list);

        Integer number = Integer.valueOf(1000);
        updateFirstElement(list, number);
        System.out.println(list);

    }

}
