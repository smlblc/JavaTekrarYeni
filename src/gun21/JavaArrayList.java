package gun21;

import java.util.ArrayList;

public class JavaArrayList {

    // ArrayList
    // Set
    // Map

    //
    public static void main(String[] args) {
        // declaring arrayLists
        ArrayList<Integer> integerArrayList;
        ArrayList<String> stringArrayList;
        ArrayList<Boolean> booleanArrayList;


        // initialize String ArrayList
        ArrayList<String> names = new ArrayList<>();

        // adding elements to arrayList
        names.add("Jon");
        names.add("Aria");
        names.add("Maruf");
        System.out.println(names);


        // adding element at specific position
        names.add(1, "Ali");
        System.out.println(names);


        // to get/retrieve/take element from arrayList
        String elementAtIndex2 = names.get(2);
        System.out.println(elementAtIndex2);


        // to update/change/set element at specific position
        String oldValue = names.set(0, "Bulut");
        System.out.println(oldValue);
        System.out.println(names);


        // to get size/length of arrayList
        int sizeOfArrayList = names.size();

        // check if arrayList is empty
        boolean empty = names.isEmpty();

        // to remove element
        names.remove("Aria"); //return boolean
        System.out.println(names);

        // to remove element at specific position
        String removedElement = names.remove(0);// return element (Bulut)
        System.out.println("RemovedElement :"+removedElement);

        // to get index of specific element
        int indexOfAli = names.indexOf("Ali");
        System.out.println(indexOfAli);


        //print without any extra method
        System.out.println(names);

        // to remove everything from arrayList
         names.clear();
        System.out.println(names);

    }
}
