package gun50.tasks.task2.food;

public class Kebab implements Food {

    @Override
    public String taste() {
        return "spicy";
    }

    public String marinade() {
        System.out.println("oil, salt");

        return "oil, salt";
    }

    public void grill() {
        System.out.println("grill kebab");
    }
}
