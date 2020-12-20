package gun51.tasks.task1.device;

import day51.tasks.task1.device.laptop.AbstractLaptop;
import day51.tasks.task1.device.phone.AbstractPhone;
import day51.tasks.task1.device.tablet.AbstractTablet;
import day51.tasks.task1.device.tv.AbstractTV;
import day51.tasks.task1.device.utils.Condition;

public abstract class AbstractDevice implements Device {
    private String name;
    private double price;
    private String model;
    private Condition condition;


    @Override
    public String toString() {
        String info = "\n---" + getClass().getSimpleName() + "---" +
                "\nname:" + name +
                "\nprice:" + price +
                "\nmodel:" + model +
                "\ncondition:" + condition;



        if(this instanceof AbstractPhone) {
            AbstractPhone phone = (AbstractPhone) this;

            info += "\ncareer:" + phone.getCareer().getName();
        } else if(this instanceof AbstractTablet) {
            AbstractTablet tablet = (AbstractTablet) this;

            info += "\npen:" + (tablet.hasPen() ? "included" : "not included");
        } else if(this instanceof AbstractTV) {
            AbstractTV tv = (AbstractTV) this;

            info += "\nDiagonal:" + tv.getDiagonal();
            info += "\nOS:" + tv.getOs();
        }


        return info;
    }


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
}
