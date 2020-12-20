package gun49.interfaceKeyword.example1.vehicles;

import gun49.interfaceKeyword.example1.AbstractVehicle;
import gun49.interfaceKeyword.example1.interfaces.Electric;
import gun49.interfaceKeyword.example1.interfaces.Gas;

//to implement from multiple interfaces just put comma and write other interfaces
public class ToyotaPrius extends AbstractVehicle implements Electric, Gas {

    @Override
    public String changeBattery() {
        return "change every 1 year";
    }

    @Override
    public String changeOil() {
        return "change every 3 month";
    }

    @Override
    public String drive() {
        return "start slow, slow down on stops, goes medium";
    }
}
