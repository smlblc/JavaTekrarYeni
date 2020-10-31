package gun20;

public class JavaMethodVarargs {

    public static void main(String... args) {
        methodWithVarargs(1);
        methodWithVarargs(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        methodWithVarargs(1, 2, 3);

//        //1.way passing array
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        methodWithVarargs(array);
//        //2.way to pass the array to method
//        methodWithVarargs(new int[]{3, 4, 5, 6, 7});
    }

    public static void methodWithVarargs(int... numbers) {// int[] numbers
        int argumentsSize = numbers.length;

        System.out.println("Number of arguments: " + argumentsSize);
    }

//    ???
//    public static void objectVarargs(Object... things){
//
//    }
}