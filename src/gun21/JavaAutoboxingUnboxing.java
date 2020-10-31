package gun21;

import java.util.ArrayList;

public class JavaAutoboxingUnboxing {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(15);
        numbers.add(1);
        Integer integer1 = Integer.valueOf(5);
        numbers.add(integer1);
        System.out.println(numbers);

        //Automatic conversion of primitive types to the object of their
        // corresponding wrapper classes is known as autoboxing.
        // converting primitive to reference type(wrapper class)

        //autoboxing: put some primitive in the reference
        int i = 5;
        numbers.add(i);
        System.out.println(numbers);

        Integer integer = numbers.get(0);
        System.out.println(integer);
        // Unboxing: It is just the reverse process of autoboxing.
        // Automatically converting an object of a wrapper class to its corresponding
        // primitive type is known as unboxing.
        // converting reference type to primitive(wrapper class)

        //unboxing: get elements from reference and put into primitive
        int j = numbers.get(0);
        System.out.println(j);
    }
}
