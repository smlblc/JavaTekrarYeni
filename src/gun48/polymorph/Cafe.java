package gun48.polymorph;

import java.util.ArrayList;
import java.util.List;

public class Cafe {

    public static void main(String[] args) {
        IceCream iceCream1 = new IceCream();
        IceCream iceCream2 = new IceCream();
        IceCream iceCream3 = new IceCream();
        IceCream iceCream4 = new IceCream();
        IceCream iceCream5 = new IceCream();
        AbstractSweet iceCream6 = new IceCream();
        AbstractSweet iceCream8 = new IceCream();
        AbstractFood iceCream9 = new IceCream();
        Object iceCream10 = new IceCream();

        Baklava baklava1 = new Baklava();
        Baklava baklava2 = new Baklava();
        Baklava baklava3 = new Baklava();
        Baklava baklava4 = new Baklava();
        Baklava baklava5 = new Baklava();
        Baklava baklava6 = new Baklava();
        AbstractSweet baklava7 = new Baklava();
        AbstractSweet baklava8 = new Baklava();

        IceCream iceCreams[] = new IceCream[5];
        Baklava baklavas[] = new Baklava[5];



        List<AbstractFood> listOfFood = new ArrayList<>();
        listOfFood.add(new Baklava());
        listOfFood.add(new IceCream());
        listOfFood.add(new IceCream());


    }

}
