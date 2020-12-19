package gun42.task1;

//1. create class Account with public fields: number, balance (do not create anything extra yet)

public class Account {
    private Currency currency;
    private String number;
    private double balance;

    public Account() {
    }

    public Account(Currency currency) {

        this.currency = currency;
    }

    public String getNumber() {

        return number;
    }

    public void setNumber(String number) {

        this.number = currency + number;
    }

    public double getBalance() {

        return balance;
    }

    //withdraw and deposit
    public void withdraw(double money) {
        //balance is less than money, assuming bank doesnt allow negative balance
        if(balance < money) {
            throw new RuntimeException("cant withdraw " + currency.getSymbol() + money + ", balance is: " + currency.getSymbol() + balance);
        }

        balance -= money;
    }

    public void deposit(double money) {
        if(money > 5000) {
            throw new RuntimeException(currency.getSymbol() + "" + money + " exceeds daily deposit limit, Please visit your bank clerk");
        }
        balance += money;
    }

    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
