package gun37.tasks.task2;

public class Application {

    public static void main(String[] args) {
        CarPurchase toyota = new CarPurchase();

        try {
            toyota.buy(Condition.NEW);
        } catch(Exception e) {
            System.out.println("condition of car is not good");
            System.out.println(e.getMessage());
        }


        try {
            toyota.drive("meteor shower");
        } catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
