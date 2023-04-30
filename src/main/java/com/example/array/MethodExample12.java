package com.example.array;

public class MethodExample12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 8, 4, 2};
        int[] array1 = {1, 3, 8 };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array[i] == array1[j]) {
                    System.out.println("array[" + i + "]: " + array[i] + " =  array1[" + j + "]: " + array1[j]);
                }
            }
        }
    }
}
