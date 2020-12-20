package gun45.tasks.task1;

public class Animal {
    private int id;

    private String name;
    private String color;
    private int age;

    private Gender gender;
    private String originContinent;

    public Animal(int id, String name, String color, int age, Gender gender, String orgin) {
        setId(id);
        setName(name);
        setColor(color);
        setAge(age);
        setGender(gender);
        setOriginContinent(orgin);
    }

    //behaviors, //noise , eat , sleep,
    public String noise() {
        return "not overridden";
    }

    public String eat() {
        return "not overridden";
    }

    public String sleep() {
        return "not overridden";
    }


    @Override
    public String toString() {
        return "\nid: " + id +
                "\nname: " + name +
                "\ncolor: " + color +
                "\nage: " + age +
                "\ngender: " + gender +
                "\noriginContinent: " + originContinent +
                "\nnoise: " + noise() +
                "\neat: " + eat() +
                "\nsleep: " + sleep();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getOriginContinent() {
        return originContinent;
    }

    public void setOriginContinent(String originContinent) {
        this.originContinent = originContinent;
    }
}
