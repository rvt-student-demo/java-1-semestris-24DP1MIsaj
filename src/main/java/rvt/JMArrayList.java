package rvt;
import java.util.*;

public class JMArrayList {
    
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void onlyTheseNumbers() {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> data1 = new ArrayList<>();

        while (true) {
            int x = Integer.valueOf(reader.nextLine());

            if (x == -1) {
                break;
            }

            data1.add(x);
        }

        System.out.println("From where?");
        int from = Integer.valueOf(reader.nextLine());
        System.out.println("To where?");
        int to = Integer.valueOf(reader.nextLine());
        reader.close();

        for (int i = from; i <= to; i++) {
            System.out.println(data1.get(i));
        }
    }

    public static void listSize() {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> data2 = new ArrayList<>();

        while (true) {
            String x = reader.nextLine();

            if (x.equals("")) {
                break;
            }

            data2.add(x);
        }

        System.out.println("In total: " + data2.size());
        reader.close();
    }

    public static void onTheList() {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> data3 = new ArrayList<>();

        while (true) {
            String x = reader.nextLine();

            if (x.equals("")) {
                break;
            }

            data3.add(x);
        }

        System.out.println("Search for?");
        String search = reader.nextLine();
        reader.close();

        if (data3.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }
    }
    
    public static void removeLast(ArrayList<String> strings) {
        strings.remove(strings.size() - 1);
    }
}


