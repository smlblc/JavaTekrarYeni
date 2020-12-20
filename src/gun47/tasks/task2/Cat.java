package gun47.tasks.task2;

public class Cat extends Animal {

    @Override
    public String food() {
        return "fish";
    }

    @Override
    public double eat() {
        return 2.5;
    }

    @Override
    public int sleep() {
        return 15;
    }

    @Override
    public String greeting() {
        return "Meow";
    }
}
