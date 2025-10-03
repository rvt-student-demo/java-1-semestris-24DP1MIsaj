package rvt;
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scanner.nextLine());
        scanner.close();

        int lower_limit;
        double rate;
        double result = 0.0;

        if (value < 5000) {
            System.out.println("No tax!");
            return;

        } else if (value >= 5000 && value <= 25000) {
            lower_limit = 100;
            rate = 0.08;
            result = lower_limit + (value - 5000) * rate;

        } else if (value > 25000 && value <= 55000) {
            lower_limit = 1700;
            rate = 0.10;
            result = lower_limit + (value - 25000) * rate;

        } else if (value > 55000 && value <= 200000) {
            lower_limit = 4700;
            rate = 0.12;
            result = lower_limit + (value - 55000) * rate;

        } else if (value > 200000 && value <= 1000000) {
            lower_limit = 22100;
            rate = 0.15;
            result = lower_limit + (value - 200000) * rate;

        } else if (value > 1000000) {
            lower_limit = 142100;
            rate = 0.17;
            result = lower_limit + (value - 1000000) * rate;
        }

        System.out.println("Tax: " + result);

    }
}