package gun48.tasks.task1;

import day42.tasks.task1.Currency;

public class WellsFargo extends Bank {

    private double commission;

    public WellsFargo(String name, String address, String email, String phone,
                      double balance, Currency currency, double commission) {
        super(name, address, email, phone, balance, currency);

        this.commission = commission;
    }


    @Override
    public double buyEuroWithDollar(double amount) {
        return amount * 1.1 - commission;
    }

    @Override
    public double sellEuroGetDollar(double amount) {
        return amount * 1.3 - commission;
    }

}
