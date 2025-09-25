package rvt;
import java.util.Scanner;

public class Detalas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = Integer.valueOf(scanner.nextLine());
        int value2 = Integer.valueOf(scanner.nextLine());
        int value3 = Integer.valueOf(scanner.nextLine());
        scanner.close();

        int sk1 = 5;
        int sk2 = 3;
        int sk3 = 1;
        int result = value1 * sk1 + value2 * sk2 + value3 * sk3;

        System.out.println("Skrūvju skaits:" + value1);
        System.out.println("Uzgriežņu skaits:" + value2);
        System.out.println("Paplāksņu skaits:" + value3);
        System.out.println();


        if (value2 >= value1 && value3 * 2 > value1) {
            System.out.println("Pasūtījums ir kārtība");
            System.out.println();
        } else {
            if (value2 < value1) {
                System.out.println("Pārbaudi pasūtījumu: par maz uzgriežņu");
                System.out.println();
            }
            if (value3 * 2 < value1) {
                System.out.println("Pārbaudi pasūtījumu: par maz paplāksņu");
                System.out.println();
            }
        }
        System.out.println("Kopējā cena: " + result);
    }
}