package gun49.interfaceKeyword.example1;

//interfaces provides 0-100% abstractions
public abstract class AbstractVehicle {
    private String model;
    private double engine; //2.5l

    public AbstractVehicle(){}

    //describe how vehicle starts/from 0m/h to 40m/h
    public abstract String drive();


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }


}
