package gun50.tasks.task2.food;

public interface Food {

    String taste();

    /*
    They allow us to add new methods to an interface
         that are automatically available in the implementations.
    Thus, there's no need to modify the implementing classes.
     */
    default void print() {
        System.out.println("Food taste: " + taste());
    }

}
