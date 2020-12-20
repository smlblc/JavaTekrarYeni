package gun50.tasks.task2.food;

public class Maklube implements Food {

    @Override
    public String taste() {
        return "life split into two before maklube and after maklube";
    }

    public String design() {
        return "layers";
    }

    public void fry() {
        System.out.println("fry potato");
    }

    public void boil() {
        System.out.println("boil everything in pot");
    }
}
