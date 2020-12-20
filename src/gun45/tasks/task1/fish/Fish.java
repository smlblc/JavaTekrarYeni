package gun45.tasks.task1.fish;

import day45.tasks.task1.Animal;
import day45.tasks.task1.Gender;

public class Fish extends Animal{
    public Fish(int id, String name, String color, int age, Gender gender, String orgin) {
        super(id, name, color, age, gender, orgin);
    }

    @Override
    public String noise() {
        return super.noise();
    }

    @Override
    public String eat() {
        return super.eat();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public Gender getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(Gender gender) {
        super.setGender(gender);
    }

    @Override
    public String getOriginContinent() {
        return super.getOriginContinent();
    }

    @Override
    public void setOriginContinent(String originContinent) {
        super.setOriginContinent(originContinent);
    }
}
