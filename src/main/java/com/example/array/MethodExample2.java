package com.example.array;

public class MethodExample2 {
    public static void main(String[] args) {
        int[] array = {12, 21, 36, 71, 24, 85, 12, 30, 25};
        int sum = 0;
        for (int x : array)
            sum += x;
        System.out.println(sum / array.length);
    }
}
