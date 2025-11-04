package rvt;
import java.util.Scanner;

public class Statistics3 {
    private int sum;

    public Statistics3() {
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.sum += number;
    }

    public int sum() {
        return this.sum;
    }
}

class MainProgram3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics3 stats = new Statistics3();

        System.out.println("Enter numbers:");

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }
            stats.addNumber(number);
        }

        System.out.println("Sum: " + stats.sum());
        scanner.close();
    }
}
