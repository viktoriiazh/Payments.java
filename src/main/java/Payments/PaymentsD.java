package Payments;

import utils.Constants;

import java.util.Scanner;

public class PaymentsD {
    static int points;
    static String stars;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(Constants.POINT_MSG);
        points = scan.nextInt();
        scan.close();

        switch (points) {
            case 1 -> {
                stars = Constants.RATE1_MSG;
                showPoint(stars);
            }
            case 2 -> {
                stars = Constants.RATE2_MSG;
                showPoint(stars);
            }
            case 3 -> {
                stars = Constants.RATE3_MSG;
                showPoint(stars);
            }
            case 4 -> {
                stars = Constants.RATE4_MSG;
                showPoint(stars);
            }
            case 5 -> {
                stars = Constants.RATE5_MSG;
                showPoint(stars);
            }
            default -> System.out.println(Constants.RATE_UNKNOWN_MSG);
        }
    }

    static void showPoint(String stars) {
        System.out.println(Constants.RTG_MSG + stars);
    }
}
