package com.example.array;

import java.util.Arrays;

public class MethodExample {
    public static void main(String[] args) {
        int[] array = {12, 21, 36, 71, 24, 85, 12, 30, 25};
        maxSort(array);
        int min = array[0];
        for (int j : array) {
            if (j > min)
                min = j;
        }
        System.out.println(min);
    }

    private static void maxSort(int[] array) {
        Arrays.sort(array);
        System.out.println(array[array.length-1]);
    }

}
