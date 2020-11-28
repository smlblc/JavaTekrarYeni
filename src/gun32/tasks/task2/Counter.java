package gun32.tasks.task2;

/*
1. create class Counter
2. add static attribute [int count = 0]
3. increment value of count in default constructor of Counter class
 */
public class Counter {
    //class member
    private static int count = 0;

    public Counter() {
        count++;
    }

    public String toString() {
        return "Count: " + count;
    }
}
