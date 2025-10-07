package rvt;

public class Sum_of_array {

    public static void main(String[] args) {
        int[] data = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(data);
    }

    public static void sumOfNumbersInArray(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        System.out.println(sum);
    }
}
