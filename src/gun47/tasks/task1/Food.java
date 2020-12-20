package gun47.tasks.task1;

//100% abstraction
public abstract class Food {
    public String name;

    public abstract void madeIn();

    public abstract void taste();

    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }
}
