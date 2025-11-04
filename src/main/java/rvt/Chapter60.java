package rvt;

public class Chapter60 {

    public static void main(String[] args) {
        int[] val1 = {0, 1, 2, 3};
        ex1(val1);

        int[] val2 = {13, -4, 82, 17};
        int[] twice = new int[val2.length];
        ex2(val2, twice);

        int[] valA1 = { 13, -22,  82,  17}; 
        int[] valB1 = {-12,  24, -79, -13};
        int[] sum = {0, 0, 0, 0};
        ex3(valA1, valB1, sum);

        int[] valA2 = {13, -22, 82, 17}; 
        int[] valB2 = {0, 0 , 0, 0};
        ex4(valA2, valB2);

        int[] val3 = {0, 1, 2, 3}; 
        int[] temp = new int[val3.length];
        ex5(val3, temp);

    }

    public static void ex1(int[] val1) {
        int sum = 0;
        for (int i = 0; i < val1.length; i++) {
            sum += val1[i];
        }

        System.out.println( "Sum of all numbers = " + sum );
    }

    public static void ex2(int[] val2, int[] twice) {
        System.out.println( "Original Array: " + val2[0] + " " + val2[1] 
        + " " + val2[2] + " " + val2[3] );

        for (int i = 0; i < val2.length; i++) {
            twice[i] = val2[i] * val2[i];
        }

        System.out.println( "New Array: " + twice[0] + " " + twice[1] 
        + " " + twice[2] + " " + twice[3] );
    }

    public static void ex3(int[] valA, int[] valB, int[] sum) {
        for (int i = 0; i < sum.length; i++) {
            sum[i] = valA[i] + valB[i];
        }

        System.out.println( "sum: " + sum[0] + " " + sum[1] + " " 
        + sum[2] + " " + sum[3] );
    }

    public static void ex4(int[] valA2, int[] valB2) {
        for (int i = 0; i < valB2.length; i++) {
            valB2[i] = 25 - valA2[i];
        }

        System.out.println( "valA: " + valA2[0] + " " + valA2[1] 
        + " " + valA2[2] + " " + valA2[3] );

        System.out.println( "valB: " + valB2[0] + " " + valB2[1] 
        + " " + valB2[2] + " " + valB2[3] );

        System.out.println( "sum:  " + (valA2[0] + valB2[0]) 
        + " " + (valA2[1] + valB2[1]) + " " + (valA2[2] + valB2[2]) + " " 
        + (valA2[3] + valB2[3]) );
    }

    public static void ex5(int[] val3, int[] temp) {
        System.out.println( "Original Array: " 
        + val3[0] + " " + val3[1] + " " + val3[2] + " " + val3[3] );

        int index = val3.length - 1;
        for (int i = 0 ; i < val3.length; i++) {
            temp[i] = val3[index];
            index--;
        }
        
        val3 = temp;
        System.out.println( "Reversed Array: " 
        + val3[0] + " " + val3[1] + " " + val3[2] + " " + val3[3] );
    }
}