package gun49.tasks.task2.animals;

import gun49.tasks.task2.interfaces.Animal;

public class Shark implements Animal {
    @Override
    public String food() {
        return "fish";
    }
}
