package rvt;
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password?");
        String password = scanner.nextline();
        scanner.close();

        String kods = "Caput Draconis";
        
        if (password == kods) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}