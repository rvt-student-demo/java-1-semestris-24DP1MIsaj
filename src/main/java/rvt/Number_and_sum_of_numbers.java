package rvt;
import java.util.Scanner;

public class Number_and_sum_of_numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        int result = 0;
        int skaits = -1;
        while (num != 0) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
            result += num;
            skaits += 1;
        }
        scanner.close();
        System.out.println("Number of numbers: " + skaits);
        System.out.println("Sum of the numbers: " + result);
    }
}