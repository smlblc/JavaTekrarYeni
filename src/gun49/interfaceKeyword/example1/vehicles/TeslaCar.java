package gun49.interfaceKeyword.example1.vehicles;

import gun49.interfaceKeyword.example1.AbstractVehicle;
import gun49.interfaceKeyword.example1.interfaces.Electric;

//to inherit from interface use keyword 'implements'
public class TeslaCar extends AbstractVehicle implements Electric {

    @Override
    public String changeBattery() {
        return "change every 2 years";
    }

    @Override
    public String drive() {
        return "start fast, no slow down, goes fast";
    }

}
