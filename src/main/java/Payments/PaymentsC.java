package Payments;

import utils.Constants;

import java.util.Scanner;

public class PaymentsC {
    static int color;
    static String colorMsg;

    public static void main(String[] args) {

        System.out.println(Constants.QUESTION_MSG);
        Scanner scan = new Scanner(System.in);
        color = scan.nextInt();
        scan.close();

       switch (color) {
            case 1 -> {
                colorMsg = Constants.RED_MSG;
                showMsg(colorMsg);
            }
            case 2 -> {
                colorMsg = Constants.YELLOW_MSG;
                showMsg(colorMsg);
            }
            case 3 -> {
                colorMsg = Constants.GREEN_MSG;
                showMsg(colorMsg);
            }
           default -> {
               colorMsg = Constants.UNKNOWN_MSG;
               showMsg(colorMsg);
           }
       }
    }

    static void showMsg(String colorMsg) {
        System.out.println(colorMsg);
    }
}
