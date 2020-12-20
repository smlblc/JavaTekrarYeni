package gun50.tasks.task2.food;

public abstract class AbstractFood {

    public abstract String taste();

    public void print(){
        System.out.println("Food taste: " + taste());
    }
}
