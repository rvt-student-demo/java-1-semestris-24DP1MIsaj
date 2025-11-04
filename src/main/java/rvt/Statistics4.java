package rvt;
import java.util.Scanner;

public class Statistics4 {
    private int count;
    private int sum;

    public Statistics4() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        count++;
        sum += number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        if (count == 0) return 0;
        return (double) sum / count;
    }
}

class MainProgram4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics4 allNumbers = new Statistics4();
        Statistics4 evenNumbers = new Statistics4();
        Statistics4 oddNumbers = new Statistics4();

        System.out.println("Enter numbers:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            allNumbers.addNumber(number);

            if (number % 2 == 0) {
                evenNumbers.addNumber(number);
            } else {
                oddNumbers.addNumber(number);
            }
        }

        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
        scanner.close();
    }
}
