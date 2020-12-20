package gun49.tasks.task1.vehicles;

import gun49.tasks.task1.interfaces.Flying;
import gun49.tasks.task1.interfaces.Vehicle;

public class AirPlane implements Vehicle, Flying {
    private int altitude;

    @Override
    public int speed() {
        return 575; //m/h
    }

    @Override
    public String fly() {
        if(altitude > Flying.maxAltitude) {
            throw new RuntimeException("Cant fly higher");
        }

        return "The layer of the Earth's atmosphere where most planes fly is the TROPOSPHERE";
    }
}
