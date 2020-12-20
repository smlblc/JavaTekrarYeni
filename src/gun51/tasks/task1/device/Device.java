package gun51.tasks.task1.device;

public interface Device {

    //2.way
//    default double getPrice() {
//        AbstractDevice absDev = (AbstractDevice) this;
//        return absDev.getPrice();
//    }

    double getPrice();

    String getName();

}
