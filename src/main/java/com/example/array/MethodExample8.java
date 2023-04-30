package com.example.array;

import java.util.Arrays;

public class MethodExample8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int a = 1, count = 0;
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            if (i == a) {
                count++;
            }
            newArray[i] = array[count];
            count++;
        }
        System.out.print(Arrays.toString(newArray) + ", ");
    }
}
