package gun45.tasks.task1.cat;

import day45.tasks.task1.Gender;

public class Lion extends Cat {


    public Lion(int id, String name, String color, int age, Gender gender, String orgin) {
        super(id, name, color, age, gender, orgin);
    }

    @Override
    public String noise() {
        return "roar";
    }

    @Override
    public String sleep() {
        return "always sleeping";
    }

    @Override
    public String toString() {
        return "\n--- Lion ---"+
                super.toString();
    }
}
