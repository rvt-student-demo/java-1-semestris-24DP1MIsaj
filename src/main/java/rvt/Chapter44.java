package rvt;

import java.util.Scanner;

public class Chapter44 {
    public static void main(String[] args) {
        ex4();
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
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine().trim();

            if (name.startsWith("Amy") || name.startsWith("Buffy") || name.startsWith("Cathy")) {
                System.out.println("Ms. " + name);

            } else if (name.startsWith("Elroy") || name.startsWith("Fred") || name.startsWith("Graham")) {
                System.out.println("Mr. " + name);

            } else if (name.equals("")) {
                break;

            } else {
                System.out.println(name);
            }

            System.out.println();
        }
    }

    public static void ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cook time-> ");
        String time = scanner.nextLine().trim();

        int x = 0;
        int y = 0;
        String z = "";
        String w = "";
        if (time.length() == 4) {
            x = 1;
            y = 3;
        } else if (time.length() == 3) {
            x = 2;
            y = 4;
        } else if (time.length() == 2) {
            x = 0;
            y = 2;
            z = "0";
        } else if (time.length() == 1) {
            x = 0;
            y = 1;
            z = "0";
            w = "0";
        }

        System.out.print("Your time-> " + z + time.substring(0, x) + ":" + w + time.substring(x, y));
    }   

    public static void ex5() {

    }

    public static void ex6() {

    }

    public static void ex7() {

    }
}
