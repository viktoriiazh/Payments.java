package Payments;

import utils.Constants;

import java.util.Scanner;

public class PaymentsB {
    static int allSum;
    static int prod;
    static int extraRate;
    static int sum1 = 10000;
    static int sum2 = 20000;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть суму об'єму продажів: ");
        prod = scan.nextInt();
        scan.close();

        if (prod <= sum1) {
            extraRate = 10;
            allSum = calcSumTotal(prod, extraRate);
            showResult(allSum);
        } else if (prod <= sum2) {
            extraRate = 15;
            allSum = calcSumTotal(prod, extraRate);
            showResult(allSum);
        } else {
            extraRate = 20;
            allSum = calcSumTotal(prod, extraRate);
            showResult(allSum);
        }

    }

    static private int calcSumTotal(int prod, int extraRate) {
        return prod + prod * extraRate / 100;
    }

    static void showResult(int allSum) {
        System.out.printf(Constants.FOR_BONUS_MSG + allSum);
    }
}
