package gun21;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");


        printColorsLines(colors);

        addToFirstPosition(colors, "Yellow");
        printColors(colors);
        addToFirstPosition(colors, "Pink");

        printColors(colors);
    }

    // Write a method to create a new array list,
    // add some colors (string) and print out the collection.
    public static void printColors(ArrayList<String> colors) {
        System.out.println(colors);
    }

    // Write a method to iterate through all elements in arrayList
    // and print in separate lines
    public static void printColorsLines(ArrayList<String> colors) {
        // 1. way
        for(String color : colors) {
            System.out.println(color);
        }

        // 2. way
        // for(int i = 0; i < colors.size(); i++) {
        //  System.out.println(colors.get(i));
        // }
    }

    //write a method to insert an element into the array list at the first position
    public static void addToFirstPosition(ArrayList<String> colors, String firstColor) {
        colors.add(0, firstColor);
    }


}
