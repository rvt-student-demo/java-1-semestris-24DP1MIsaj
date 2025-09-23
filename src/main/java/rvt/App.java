package rvt;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        // Your code goes here...
        Scanner scanner = new Scanner(System.in);
        int age = Integer.valueOf(scanner.nextLine());
        scanner.close();

        if (age > 18) {
            System.out.println("Tu esi pilngadīgs");
        } else {
            System.out.println("Tu nevari lietot programmu");
        }
    }
}
