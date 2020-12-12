package gun37.tasks.task2;


enum Condition {
    NEW, MEDIUM, OLD, WASTE;
}

public class CarPurchase {

    /*
    create method 'buy' with enum parameter as conditions of car,
    and throws checked/expected exception if its too old
     */
    public void buy(Condition condition) throws Exception {
        if(condition == Condition.OLD || condition == Condition.WASTE) {
            throw new Exception("this car is not in good shape, please look to other cars");
        }

        System.out.println("Congrats with new car!!");
    }

    /*
    create method 'drive' with String parameter as weather,
    and throws unchecked/runtime exception if weather is not normal
     */
    public void drive(String weather) {
        if(!weather.equalsIgnoreCase("normal")) {
            throw new RuntimeException("cannot drive now, bad weather");
        }

        System.out.println("Driving to sunset");
    }
}
