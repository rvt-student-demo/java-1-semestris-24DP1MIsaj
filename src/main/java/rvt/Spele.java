package rvt;
import java.util.Scanner;
import java.util.Random;

public class Spele {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int random_num = random.nextInt(10) + 1;
        System.out.println("Es domāju par skaitli no 1 līdz 10.");
        System.out.println("Tev tas jāuzmin trīs mēģinājumos.");
        System.out.println("Ievadi minējumu.");
        
        int meginajumi = 3;
        while (true) {
            if (meginajumi == 0) {
                System.out.println("Pareizais skaitlis bija " + random_num + ".");
                System.out.println("Tu esi zaudējis spēli.");
                break;
            }
            int num = Integer.valueOf(scanner.nextLine());
            if (num == random_num) {
                System.out.println("PAREIZI!");
                System.out.println("Tu esi uzvarējies spēli.");
                break;
            } else {
                System.out.println("nepareizi");
                meginajumi = meginajumi - 1;
            }
        }
        scanner.close();
    }
}