package rvt;

public class Print_in_stars {

    public static void main(String[] args) {
        int[] data = {5, 1, 3, 4, 2};
        printArrayInStars(data);
    }

    public static void printArrayInStars(int[] data) {
        for (int i = 0; i < data.length; i++) {
            String result = "";
            for (int star = 0; star < data[i]; star++) {
                result += "*";
            }
            System.out.println(result);
        }
    }
}