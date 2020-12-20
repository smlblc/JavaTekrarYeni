package gun49.interfaceKeyword.example1.vehicles;

import gun49.interfaceKeyword.example1.AbstractVehicle;
import gun49.interfaceKeyword.example1.interfaces.Diesel;

public class Bus extends AbstractVehicle implements Diesel {

    @Override
    public String drive() {
        return "start slow, slow every time, goes slow";
    }

}
