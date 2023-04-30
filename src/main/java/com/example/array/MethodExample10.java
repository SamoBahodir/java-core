package com.example.array;

public class MethodExample10 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 2, 2, 5};
        int n = 2, count = 0;

        int[] newArray = new int[array.length];
        for (int x = 0; x < array.length; x++) {
            if (array[x] == n)
                count++;
            newArray[x] = array[x];
        }
        System.out.print(n + " soni: " + count);
    }
}
