package gun23;

import java.util.HashSet;

public class JavaSet1 {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Red");
        set.add("red");
        set.add("rED");

        System.out.println(set);

    }

}
