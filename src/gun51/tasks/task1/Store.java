package gun51.tasks.task1;

import day51.tasks.task1.device.Device;
import day51.tasks.task1.device.laptop.MacBook;
import day51.tasks.task1.device.phone.IOSPhone;
import day51.tasks.task1.device.utils.Career;
import day51.tasks.task1.device.utils.Condition;
import day51.tasks.task1.device.utils.DisplayType;

public class Store {

    public static void main(String[] args) {

        IOSPhone iphone11 = new IOSPhone();
        iphone11.setName("IPhone 11 pro max");
        iphone11.setCondition(Condition.NEW);
        iphone11.setModel("IPhone");
        iphone11.setCareer(Career.UNLOCKED);
        iphone11.setPrice(1200);
//        System.out.println(iphone11);

        MacBook mac = new MacBook();
        mac.setCondition(Condition.OPEN_BOX);
        mac.setDisplayType(DisplayType.Retina);
        mac.setModel("Pro");
        mac.setName("MacBook 16' Pro");
        mac.setRAM(16);
        mac.setScreenSize(16.0);
        mac.setPrice(3000);
//        System.out.println(mac);

        ShoppingCard card = new ShoppingCard();
        card.addDevice(iphone11);
        card.addDevice(mac);
        System.out.println("Total 2 items: " + card.getTotalPrice());

        card.removeDevice(mac);
        System.out.println("Total 1 item: " + card.getTotalPrice());
        card.checkOut(20000);

        card.printReceipt();
        /*
        Exception in thread "main" MoneyNotEnoughException: You dont have enough money
	    at day51.tasks.task1.ShoppingCard.checkOut(ShoppingCard.java:41)
	    at day51.tasks.task1.Store.main(Store.java:38)
         */


    }
}
