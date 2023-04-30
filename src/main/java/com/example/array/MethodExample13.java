package com.example.array;

import java.util.Arrays;

public class MethodExample13 {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 4, 2};
        int count = 0;
        int[] newArray = new int[array.length];
        for (int j = 0; j < array.length; j++) {
            for (int i = j+1; i < array.length; i++) {
                if (array[j] == array[i]) {
                    count++;
                }
                newArray[i] = array[count];
                count++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}


