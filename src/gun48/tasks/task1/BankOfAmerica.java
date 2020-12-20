package gun48.tasks.task1;

import day42.tasks.task1.Currency;

public class BankOfAmerica extends Bank {

    public BankOfAmerica(String name, String address, String email, String phone, double balance, Currency currency) {
        super(name, address, email, phone, balance, currency);
    }

    @Override
    public double buyEuroWithDollar(double amount) {
        return amount * 1.0002;
    }

    @Override
    public double sellEuroGetDollar(double amount) {
        return amount * 1.3;
    }
}
