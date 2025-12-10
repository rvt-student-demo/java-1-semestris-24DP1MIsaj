package rvt;

import java.util.Scanner;

public class Chapter44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ex6(scanner);
    }

    public static void ex1(Scanner scanner) {
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

    public static void ex2(Scanner scanner) {
        System.out.print("Enter a string: ");
        String string = scanner.nextLine().trim();

        System.out.println();

        for(int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

    public static void ex3(Scanner scanner) {
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

    public static void ex4(Scanner scanner) {
        System.out.print("Enter cook time-> ");
        String time = scanner.nextLine().trim();

        String minutes = "";
        String seconds = "";
        if (time.length() == 4) {
            minutes = time.substring(0, 2);
            seconds = time.substring(2);
        } else if (time.length() == 3) {
            minutes = time.substring(0, 1);
            seconds = time.substring(1);
        } else if (time.length() == 2) {
            minutes = "0";
            seconds = time;
        } else if (time.length() == 1) {
            minutes = "0";
            seconds = "0" + time;
        }

        System.out.println("Your time-> " + minutes + ":" + seconds);
    }   

    public static void ex5(Scanner scanner) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();

            if (line.startsWith("//") || line.startsWith("/*") || line.startsWith("*/")) {
                System.out.println();
                break;
            }
        }
    }

    public static void ex6(Scanner scanner) {
        while (true) {
            System.out.println("Enter your password: ");
            String password = scanner.nextLine().trim();

            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasDigit = false;

            for (int i = 0; i < password.length(); i++) {
                char x = password.charAt(i);
                if (x >= 'A' && x <= 'Z') {
                    hasUpper = true;
                } else if (x >= 'a' && x <= 'z') {
                    hasLower = true;
                } else if (x >= '0' && x <= '9') {
                    hasDigit = true;
                }
            }

            if (hasUpper && hasLower && hasDigit && password.length() >= 7) {
                System.out.println("Acceptable password.");
                break;
            } else {
                System.out.println("That password is not acceptable.");
                System.out.println("");
            }
        }
    }

    public static void ex7(Scanner scanner) {
        System.out.print("Enter a word --> ");
        String word = scanner.nextLine().trim();

        for (int i = 0; i < word.length(); i++) {
            if (i >= word.length() - i) {
                break;
            }

            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            System.out.println(word.substring(i, word.length() - i));
        }
    }
}
