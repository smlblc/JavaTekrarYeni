package gun38.tasks.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Task2 t2 = new Task2();

        ArrayList<Double> prices = t2.getPrices();
        System.out.println(prices);

        double average = t2.priceAverage(prices);
        System.out.println("Average:" + average);
    }

    //1. create method that gets price from user until input given by user is "exit"
    public ArrayList<Double> getPrices() {
        ArrayList<Double> prices = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide prices (as double):");
        String strPrice = scanner.nextLine();

        while(!strPrice.equals("exit")) {
            try {
                double price = Double.parseDouble(strPrice);
                //2. add prices to ArrayList
                prices.add(price);
            } catch(NumberFormatException ex) {
                System.out.println("Please provide valid price");
            }

            strPrice = scanner.nextLine(); //
        }

        return prices;
    }

    //3. create method to get average prices
    public double priceAverage(ArrayList<Double> prices) {
        double sum = 0;
        for(Double price : prices) {
            sum += price;
        }

        if(sum == 0) {
            throw new ArithmeticException("Sum is zero, there is no average");
        }

        double average = sum / prices.size();

        return average;
    }

}
