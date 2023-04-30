package com.example.array;

import java.util.Arrays;

public class MethodExample5 {
    public static void main(String[] args) {
        int[] array = {6, 25, 91, 23, 72, 9, 18, 6};
        int[] newArray = new int[array.length+1];
        int n = 23;
        for (int x = 0; x < array.length; x++) {
            newArray[x] = array[x];
            newArray[array.length]=n;
        }
            System.out.print(Arrays.toString(newArray) + ", ");
    }
}
