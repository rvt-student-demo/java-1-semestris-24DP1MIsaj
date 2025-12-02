package rvt;

import java.util.Scanner;

public class Chapter44 {
    public static void main(String[] args) {
        ex1();
        ex2();
    }

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();

        System.out.println();

        int spaceIndex = name.indexOf(" ");

        if (spaceIndex <= 0) {
            System.out.println(name);
        } else {
            String first = name.substring(0, spaceIndex);
            String last = name.substring(spaceIndex + 1);

            last = last.toUpperCase();

            System.out.println(first + " " + last);
        }
    }

    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine().trim();

        System.out.println();

        for(int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

    public static void ex3() {

    }

    public static void ex4() {

    }

    public static void ex5() {

    }

    public static void ex6() {

    }

    public static void ex7() {

    }
}
