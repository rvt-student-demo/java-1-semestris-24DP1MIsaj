package rvt;
import java.util.Scanner;

public class Are_we_there_yet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (num != 4) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
        }
        scanner.close();
    }
}