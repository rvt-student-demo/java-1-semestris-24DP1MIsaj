package rvt;
import java.util.Scanner;

public class App3 {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int num1 = Integer.valueOf(reader.nextLine());

        System.out.println("Give the second number: ");
        int num2 = Integer.valueOf(reader.nextLine());

        System.out.println("Give the third number: ");
        int num3 = Integer.valueOf(reader.nextLine());
        reader.close();

        int result = num1 + num2 + num3;
        double result2 = result / 3;

        System.out.println("The average is " + result2);
    }
}