package rvt;
import java.util.Scanner;

public class Repeating {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");

        int result = 0;
        int end = 1;
        int even = 0;
        int odd = 0;
        for (int start = 0; start <= end; start++) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            } else if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            result += num;
            end++;
        }
        scanner.close();
        int skaits = end - 1;
        double average = (double) result / skaits;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + result);
        System.out.println("Numbers: " + skaits);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}