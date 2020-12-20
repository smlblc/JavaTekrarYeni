package gun48.tasks.task1;

import day42.tasks.task1.Currency;

public class ChaseBank extends Bank {

    private double buyRate;
    private double sellRate;
    private double bonus;

    public ChaseBank(String name, String address, String email, String phone,
                     double balance, Currency currency,
                     double buyRate, double sellRate, double bonus) {
        super(name, address, email, phone, balance, currency);
        this.buyRate = buyRate;
        this.sellRate = sellRate;
        this.bonus = bonus;
    }

    @Override
    public double buyEuroWithDollar(double amount) {
        withdraw(amount);
        return amount * buyRate + bonus;
    }

    @Override
    public double sellEuroGetDollar(double amount) {
        amount = amount * sellRate + bonus;
        deposit(amount);
        return amount;
    }
}
