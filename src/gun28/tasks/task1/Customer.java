package gun28.tasks.task1;

public class Customer {
    String name;
    ElectricityAccount electricityAccount;

    void consumeElectricity(double wph) {
        if(wph < 0) {
            System.out.println("Provided '" + wph + "wph' is not valid!!!, it should be positive number");
        } else {
            electricityAccount.totalWph += wph;
        }
    }

}
