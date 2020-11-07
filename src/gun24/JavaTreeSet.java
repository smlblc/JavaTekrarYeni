package gun24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class JavaTreeSet {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");
        hashSet.add("Apple");
        System.out.println("HashSet: " + hashSet);

        // sorts elements in ascending order, always!!!
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("B");
        treeSet.add("D");
        treeSet.add("C");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("A");

        System.out.println("TreeSet: " + treeSet);


        // maintains insertion(order of adding) elements to set
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        linkedHashSet.add("Four");
        linkedHashSet.add("Five");
        linkedHashSet.add("Apple");
        System.out.println("LinkedHashSet: " + linkedHashSet);


    }
}
