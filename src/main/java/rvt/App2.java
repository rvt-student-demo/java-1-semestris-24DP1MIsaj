package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int num1 = Integer.valueOf(reader.nextLine());

        System.out.println("Give the first number: ");
        int num2 = Integer.valueOf(reader.nextLine());

        int result = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}