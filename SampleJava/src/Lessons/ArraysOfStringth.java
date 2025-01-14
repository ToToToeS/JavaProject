package Lessons;

import java.sql.SQLOutput;

public class ArraysOfStringth {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        arrays[0] = 1;
        arrays[1] = 5;
        String[] stting = new String[2];
        stting[0] = "Привет";
        stting[1] = "Java";
        System.out.println(stting[0]);
        System.out.println(stting[1]+'\n');

        for(String x:stting) System.out.println(x);
        System.out.println("");
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int x:numbers) sum = sum + x;
        System.out.println(sum);

    }
}
