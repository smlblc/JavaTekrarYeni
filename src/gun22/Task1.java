package gun22;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        ArrayList<Double> doubles = generateList();

        Double secondElement = retrieveElement(doubles, 1);

        updateElement(doubles, 1, 100.0);

        removeThirdElement(doubles);
    }

    // create a method that will generate arrayList of double with random double values
    public static ArrayList<Double> generateList() {
        ArrayList<Double> list = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            list.add(Math.random() * 100);
        }

        return list;
    }

    // create a method to retrieve an element at specified index from given arrayList
    public static Double retrieveElement(ArrayList<Double> list, int index) {
        return list.get(index);
    }

    // create a method to update element in specified position
    public static void updateElement(ArrayList<Double> list, int index, Double value) {
        list.set(index, value);
    }

    // create a method to remove the third element from an arrayList
    public static void removeThirdElement(ArrayList<Double> list) {
        list.remove(2);
    }

    // create a method to remove the element w/ given index from an arrayList
    public static void removeElementbyIndex(ArrayList<Double> list, int index) {
        list.remove(index);
    }

}
