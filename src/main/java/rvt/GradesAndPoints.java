package rvt;
import java.util.Scanner;

public class GradesAndPoints {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int num = Integer.valueOf(reader.nextLine());
        reader.close();

        String result;

        if (num < 0) {
            result = "impossible!";
        } else if (num <= 49) {
            result = "failed";
        } else if (num <= 59) {
            result = "1";
        } else if (num <= 69) {
            result = "2";
        } else if (num <= 79) {
            result = "3";
        } else if (num <= 89) {
            result = "4";
        } else if (num <= 100) {
            result = "5";
        } else {
            result = "impossible!";
        }

        System.out.println("Grade: " + result);
    }

}