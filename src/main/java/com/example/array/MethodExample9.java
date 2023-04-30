package com.example.array;

import java.util.Arrays;

public class MethodExample9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] newArray = new int[array.length];
        for (int x = 0; x < array.length; x++) {
            newArray[x] = array[array.length - x - 1];
        }
        System.out.print(Arrays.toString(newArray) + ", ");
    }
}
