package gun45.tasks.task1.cat;

import day45.tasks.task1.Gender;

public class Tiger extends Cat {

    public Tiger(int id, String name, String color, int age, Gender gender, String orgin){
        super(id, name, color, age, gender, orgin);
    }

    @Override
    public String noise() {
        return "mostly silent, but produce noise when attacks";
    }

    @Override
    public String sleep() {
        return "At night, on tree";
    }

    @Override
    public String toString() {
        return "\n--- Tiger ---"+
                super.toString();
    }
}
