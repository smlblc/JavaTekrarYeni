package gun33.mainStringArgument;

public class Sample {

    public static void main(String[] args) {
        System.out.println("Argument at index 0:" + args[0]);

        for(String argument : args) {
            System.out.println(argument);
        }
    }

}