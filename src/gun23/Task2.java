package gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class Task2 {
    //1. create an array of students names(it should have some duplications)
    public static String[] getStudentNames() {
        String[] names = {"Sema", "Bahodur", "Shavkat",
                "Ali", "Ayla", "Furkat",
                "Lana", "Laura", "Talip",
                "Ali", "Sema"};
        return names;
    }

    //2. convert array to ArrayList and to HashSet
    public static ArrayList<String> convertToArrayList(String[] names) {
        ArrayList<String> list = new ArrayList<>();
        for(String name : names) {
            list.add(name);
        }
        return list;
    }

    public static HashSet<String> convertToHashSet(String[] names) {
        ArrayList<String> list = convertToArrayList(names);
        HashSet<String> set = new HashSet<>(list);
        return set;
    }

    //3. check if you have duplication in your array
    public static boolean hasDuplication(String[] names) {
        HashSet<String> namesSet = convertToHashSet(names);
        int setSize = namesSet.size();
        int arraySize = names.length;

        return (arraySize != setSize) ;
    }

    //4. check if you have name "Samil" in you set/list,
    // if you have, print he is best mentor ever
    // else, print I wish we had him
    public static boolean hasName(HashSet<String> set, String name) {

        return set.contains(name);
    }

    public static void checkName(HashSet<String> set) {
        if(hasName(set, "Samil")) {
            System.out.println("He is the best mentor ever!!!");
        } else {
            System.out.println("I wish we had him");
        }

        // 2. way
        System.out.println(
                hasName(set, "Samil")
                        ? "He is the best mentor ever!!!"
                        : "I wish we had him"
        );

    }

    public static void main(String[] args) {
        checkName(convertToHashSet(getStudentNames()));
    }

}
