package gun51.tasks.task1.device.phone;

import day51.tasks.task1.device.AbstractDevice;
import day51.tasks.task1.device.utils.Career;

public abstract class AbstractPhone extends AbstractDevice {
    private Career career;


    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }
}
