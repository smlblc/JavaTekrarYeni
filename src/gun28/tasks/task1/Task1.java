package gun28.tasks.task1;

public class Task1 {

    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.name = "Danny";

        ElectricityAccount account = new ElectricityAccount();
        customer1.electricityAccount = account;

        customer1.consumeElectricity(100);
        customer1.consumeElectricity(200);
        customer1.consumeElectricity(50);

        customer1.consumeElectricity(-10000);

        double customer1bill = customer1.electricityAccount.calculateBill();
        System.out.println("Customer: " + customer1.name);
        System.out.println("Total Bill: $" + customer1bill);
        System.out.println("Total Bill: $" + customer1.electricityAccount.bill);

    }
}
