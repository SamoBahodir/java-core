package com.example.demo.search;

public class LinearSearchExample {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4,};
        int key = 2;
        System.out.println(linearSearch(arr, key));
    }
}
