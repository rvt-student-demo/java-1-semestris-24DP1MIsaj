package rvt;

public class App {
    public static void main(String[] args) {
        // Your code goes here...
        System.out.println("Hello");

        int calculationWithParentheses = (1 + 1) + 3 * (2 + 5);
        System.out.println(calculationWithParentheses); // prints 23

        int calculationWithoutParentheses = 1 + 1 + 3 * 2 + 5;
        System.out.println(calculationWithoutParentheses); // prints 13

        System.out.println("Four: " + (2 + 2));
        System.out.println("Twenty Four: " + 2 + 2);
    }
}
