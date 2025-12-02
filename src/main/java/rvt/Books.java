package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    private String title;
    private int pages;
    private int year;

    public Books(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + year;
    }

    public class MainProgram {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Books> books = new ArrayList<>();

            while (true) {
                System.out.print("Title: ");
                String title = scanner.nextLine();
                if (title.isEmpty()) {
                    break;
                }

                System.out.print("Pages: ");
                int pages = Integer.valueOf(scanner.nextLine());

                System.out.print("Publication year: ");
                int year = Integer.valueOf(scanner.nextLine());

                books.add(new Books(title, pages, year));
            }

            System.out.println();
            System.out.print("What information will be printed? ");
            String choice = scanner.nextLine();
            scanner.close();

            if (choice.equals("everything")) {
                for (Books b : books) {
                    System.out.println(b);
                }

            } else if (choice.equals("name")) {
                for (Books b : books) {
                System.out.println(b.getTitle());
                }
            }
        }
    }
}