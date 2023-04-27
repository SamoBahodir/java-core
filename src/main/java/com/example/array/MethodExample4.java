package com.example.array;

public class MethodExample4 {
    public static void main(String[] args) {
        int[] array = {6, 25, 91, 23, 72, 9, 18, 6};
        int n = 2;
        if (n < 0 || n >= array.length) {
            System.out.println(0);
        }else System.out.println(array[n]);

    }
}
