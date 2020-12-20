package gun49.interfaceKeyword.example1.interfaces;


//to create interface , use keyword 'interface'
//every field and method has public access modifier by default

//interfaces provides 100% abstractions
public interface Electric {
    //TODO in interface every field is 'public final static' by default
    public final int batteryLife = 100;

    //interface doesn't allow constructor
    //Electric(){}

    //TODO in interface every method is 'public abstract' by default
    public abstract String changeBattery();

    //interface doesn't allow non-abstract method except static methods
    //public void print(){}

    //TODO static methods are allowed
    public static void print() {
        System.out.println("Electric");
    }

}
