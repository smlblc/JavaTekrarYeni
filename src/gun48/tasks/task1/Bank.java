package gun48.tasks.task1;

import day42.tasks.task1.Currency;

public abstract class Bank {
    private String name;
    private String address;
    private String email;
    private String phone;
    private double balance;
    private Currency currency;

    public Bank(String name, String address, String email, String phone, double balance, Currency currency) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
        this.currency = currency;
    }

    //buy euro with dollars
    public abstract double buyEuroWithDollar(double amount);

    //sell euro, get dollars
    public abstract double sellEuroGetDollar(double amount);

    //withdraw and deposit
    public void withdraw(double amount) {
        //balance is less than amount, assuming bank doesnt allow negative balance
        if(balance < amount) {
            throw new RuntimeException("cant withdraw " + currency.getSymbol() + amount + ", balance is: " + currency.getSymbol() + balance);
        }

        balance -= amount;
    }

    public void deposit(double amount) {
        if(amount > 5000) {
            throw new RuntimeException(currency.getSymbol() + "" + amount + " exceeds daily deposit limit, Please visit your bank clerk");
        }
        balance += amount;
    }

    @Override
    public String toString() {
        return "Bank" +
                "\nname='" + name +
                "\naddress='" + address +
                "\nemail='" + email +
                "\nphone='" + phone +
                "\nbalance=" + balance +
                "\ncurrency=" + currency;
    }
}
