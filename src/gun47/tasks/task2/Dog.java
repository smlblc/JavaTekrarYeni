package gun47.tasks.task2;

public class Dog extends Animal {

    @Override
    public String food() {
        return "kebab with bones";//bone
    }

    @Override
    public double eat() {
        return 4;
    }

    @Override
    public int sleep() {
        return 7;
    }

    @Override
    public String greeting() {
        return "woof";
    }

}
