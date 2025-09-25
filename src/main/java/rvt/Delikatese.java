package rvt;
import java.util.Scanner;

public class Delikatese {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi preci:");
        String prece = scanner.nextLine();

        System.out.println("Ievadi cenu:");
        double cena = Double.valueOf(scanner.nextLine());

        System.out.println("Ekspress piegāde(0==nē, 1==jā):");
        int ekspress_piegade = Integer.valueOf(scanner.nextLine());
        scanner.close();

        double piegade = 5.00;
        double result = cena + piegade;
        
        if (ekspress_piegade == 1) {
            result += 1;
        }

        System.out.println("Rēķins:");
        System.out.println(prece +     "          " + cena);
        System.out.println("piegāde" + "          " + piegade);
        System.out.println("kopā" +    "          " + result);

    }
}