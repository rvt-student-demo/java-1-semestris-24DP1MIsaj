package rvt;
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9};

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println("");

        Scanner reader = new Scanner(System.in);
        System.out.println("Give two indices to swap:");
        int index1 = Integer.valueOf(reader.nextLine());
        int index2 = Integer.valueOf(reader.nextLine());

        System.out.println("");
        reader.close();

        int helper1 = data[index1];
        int helper2 = data[index2];
        data[index1] = helper2;
        data[index2] = helper1;

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}