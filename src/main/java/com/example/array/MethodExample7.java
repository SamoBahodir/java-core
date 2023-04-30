package com.example.array;

import java.util.Arrays;

public class MethodExample7 {
    public static void main(String[] args) {
        int[] array = {6, 25, 91, 23, 72, 9, 18, 6};
        int a = 1, b = 5;
        int[] newArray = new int[array.length + 1];
        for (int x = 0; x < array.length + 1; x++) {
            if (x > a)
                newArray[x] = array[x - 1];
            else if (x < a)
                newArray[x] = array[x];
            else
                newArray[x] = b;

        }
        System.out.print(Arrays.toString(newArray) + ", ");
    }
}
