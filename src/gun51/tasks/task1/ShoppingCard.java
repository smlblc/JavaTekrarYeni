package gun51.tasks.task1;

import day51.tasks.task1.device.Device;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {

    private List<Device> deviceList = new ArrayList<>();

    public void addDevice(Device device) {
        deviceList.add(device);
    }

    public void removeDevice(Device device) {
        deviceList.remove(device);
    }

    public double getTotalPrice() {
        double sum = 0;
        for(Device device : deviceList) {
            //1. way downcast device to AbstractDevice
            // AbstractDevice absDev = (AbstractDevice) device;
            // absDev.getPrice();

            //2. way downcast device in default method, so that you dont have to implement it in derived classes
            // device.getPrice();

            //3. way implement getPrice method in derived class
            sum += device.getPrice();
        }

        return sum;
    }

    public void checkOut(double money) {
        if(money >= getTotalPrice()) {
            System.out.println("Thank you for purchase, items shipped to your address");
        } else {
            throw new MoneyNotEnoughException("You dont have enough money");
        }
    }

    public void printReceipt() {
        //1. way downcast device to AbstractDevice
        // AbstractDevice absDev = (AbstractDevice) device;
        // absDev.getName();

        //2. way downcast device in default method, so that you dont have to implement it in derived classes
        // device.getName();

        //3. way implement getName method in derived class
        System.out.println("--------------------");
        System.out.println("------Receipt-------");
        for(Device device : deviceList) {
            System.out.println(device.getName() + ": $" + device.getPrice());
        }
        System.out.println("TOTAL: $" + getTotalPrice());
        System.out.println("--------------------");

    }
}
