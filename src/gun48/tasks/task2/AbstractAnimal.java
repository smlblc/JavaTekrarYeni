package gun48.tasks.task2;

public abstract class AbstractAnimal {

    public abstract String sound();

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + sound();
    }
}
