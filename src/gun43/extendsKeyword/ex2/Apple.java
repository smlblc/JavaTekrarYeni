package gun43.extendsKeyword.ex2;

public class Apple extends Fruit{

    //constructor are not inherited
    //but you can reuse them using super keyword
    public Apple(String name){
        super(name); //Fruit(name)
        super.name = "Red Apple";
    }
}
