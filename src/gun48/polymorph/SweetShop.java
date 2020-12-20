package gun48.polymorph;

public class SweetShop {

    public static void main(String[] args) {
        AbstractSweet sweet1 = new Baklava();
        AbstractSweet sweet2 = new IceCream();

        System.out.println("Sweet 1 taste: " + sweet1.taste());
        System.out.println("Sweet 2 taste: " + sweet2.taste());

    }

}
