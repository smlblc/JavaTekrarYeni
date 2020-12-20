package gun51.tasks.task1.device.laptop;

import day51.tasks.task1.device.AbstractDevice;
import day51.tasks.task1.device.utils.DisplayType;

public abstract class AbstractLaptop extends AbstractDevice {

    private int RAM;
    private double screenSize;
    private DisplayType displayType;// 4K, HD, FHD, Retina


    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public void setDisplayType(DisplayType displayType) {
        this.displayType = displayType;
    }


    @Override
    public String toString() {
        return super.toString()+
                "\nRAM:" + RAM +
                "\nscreenSize: " + screenSize +
                "\ndisplayType:" + displayType;
    }
}
