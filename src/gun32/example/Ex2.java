package gun32.example;

import java.util.ArrayList;

public class Ex2 {

    static final ArrayList<String> list = new ArrayList<>();

    static final String name = "Maximilian";

    public static void main(String[] args) {
        System.out.println("Replace: " + name.replace("i", "o"));
        System.out.println("Name: " + name);

        String changedName = name.replace("i", "o");
        System.out.println("Changed Name: " + changedName);



        list.add("John");
        list.add("Alice");
        System.out.println(list);

         //cannot reassign after initialization, because it is final
         //list = new ArrayList<>();

    }
}
