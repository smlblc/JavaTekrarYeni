package gun25;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    // create method that return Map as position and color
//    ex
//    1 Red
//    2 Green
    public static HashMap<Integer, String> getColorMap(String... color) {
        HashMap<Integer, String> result = new HashMap<>();

        for(int i = 0; i < color.length; i++) {
            result.put(i + 1, color[i]);
        }

        return result;
    }

    // create method to check if key is present/exists in the map
    public static boolean hasKey(HashMap<Integer, String> map, Integer key) {
        return map.containsKey(key);
    }

    // create method to check if value is present/exists in the map
    public static boolean hasValue(HashMap<Integer, String> map, String value) {
        return map.containsValue(value);
    }

    // create method to get value at specified position
    public static String getValue(HashMap<Integer, String> map, Integer key) {
        return map.get(key);
    }

    //// create method to print map as value and key
    ////ex: Red 1
    ////    Blue 2
    public static void printColors(HashMap<Integer, String> colors) {
        for(Map.Entry<Integer, String> entry : colors.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }


    public static void main(String[] args) {
        HashMap<Integer, String> colorMap = getColorMap("Red", "Green");

        boolean hasKey2 = hasKey(colorMap, 2);
        System.out.println(hasKey2);

        boolean hasValueGreen = hasValue(colorMap, "Green");
        System.out.println(hasValueGreen);

        boolean hasValueWhite = hasValue(colorMap, "White");
        System.out.println(hasValueWhite);

        String valueAtPosition1 = getValue(colorMap, 1);
        System.out.println(valueAtPosition1);
        String valueAtPosition5 = getValue(colorMap, 5);
        System.out.println(valueAtPosition5);

        printColors(colorMap);

    }

}




