package gun48.tasks.task1;

import day42.tasks.task1.Currency;

public class BankingSystem {

    public static void main(String[] args) {
        ChaseBank chaseBank1 = new ChaseBank("Chase",
                "Main 1089",
                "info@chase.com",
                "+1 258 964 72 25",
                0,
                Currency.USD,
                1.0001,
                1.3023,
                100
        );

        chaseBank1.deposit(1000);
        chaseBank1.withdraw(200);

        chaseBank1.buyEuroWithDollar(10);
        chaseBank1.sellEuroGetDollar(20);

        System.out.println(chaseBank1);
    }
}
