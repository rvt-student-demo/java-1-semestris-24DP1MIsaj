package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int num1 = Integer.valueOf(reader.nextLine());

        System.out.println("Give the first number: ");
        int num2 = Integer.valueOf(reader.nextLine());

        int result1 = num1 + num2;
        int result2 = num1 / num2;

        System.out.println(num1 + " + " + num2 + " = " + result1);

        System.out.println(num1 + " / " + num2 + " = " + result2);
        // dalot (int) ar (int)
        // rezultāts vienmēr (int)

        double whenDividendIsFloat = 3.0 / 2;
        System.out.println(whenDividendIsFloat); // prints 1.5

        double whenDivisorIsFloat = 3 / 2.0;
        System.out.println(whenDivisorIsFloat); // prints 1.5
    }

}
