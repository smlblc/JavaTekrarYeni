package gun32.tasks.task2;

public class Task2 {

    public static void main(String[] args) {
        Counter c1 = new Counter();
        System.out.println(c1);
        new Counter();
        new Counter();
        new Counter();
        System.out.println(new Counter());

        Counter c2 = new Counter();
        System.out.println(new Counter());

    }
}
