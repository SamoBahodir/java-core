package com.example.array;

import com.example.java.Sort;

import java.util.Arrays;

public class MethodExample1 {
    public static void main(String[] args) {
        int[] array = {12, 21, 36, 71, 24, 1, 85, 12, 30, 25};
        sortMin(array);
        int min = array[0];
        for (int j : array) {
            if (j < min)
                min = j;
        }
        System.out.println(min);
    }

    private static void sortMin(int[] array) {
        Arrays.sort(array);
        System.out.println(array[0]);
    }
}
