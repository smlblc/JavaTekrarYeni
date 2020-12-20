package gun50.javaInstaceof;

import java.util.List;

interface Animal{

}

public class Simple {

    public static void main(String[] args) {
        Simple s = new Simple();
        //instanceof operator is used to test whether the object is an instance of the specified type

                                                        //s == Simple
        System.out.println("s instanceof Simple: " + (s instanceof Simple));
        System.out.println("s instanceof Object: " + (s instanceof Object));
        System.out.println("s instanceof Animal: " + (s instanceof Animal));

    }
}
