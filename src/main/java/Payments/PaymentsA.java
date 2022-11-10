package Payments;

import utils.Constants;
import java.util.Scanner;


public class PaymentsA {
    static double allSum;
    static int payMethod;
    static double sum;
    static int extraRate;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the purchase amount:");
        sum = scan.nextDouble();
        System.out.println("""
                Choose payment methods:
                1. Cash(no commission)
                2. Card(commission 3%)
                3. Invoice(commission 5%)
                """);

        payMethod = scan.nextInt();
        scan.close();

        switch (payMethod) {
            case 1 -> {
                extraRate = 0;
                allSum = calcAmountTotal(sum, extraRate);
                showResult(allSum);
            }
            case 2 -> {
                extraRate = 3;
                allSum = calcAmountTotal(sum, extraRate);
                showResult(allSum);

            }
            case 3 -> {
                extraRate = 5;
                allSum = calcAmountTotal(sum, extraRate);
                showResult(allSum);
            }
            default -> System.out.println(Constants.UNKNOWN_MSG);
        }
    }

    //Метод для обчислення суми до оплати
    static private double calcAmountTotal(double sum, int extraRate) {
        return sum + sum * extraRate / 100;
    }

    //Метод виведення даних
    static void showResult(double allSum) {
        System.out.printf(Constants.FOR_PAYMENT_MSG + allSum);
    }
}
