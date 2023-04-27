package com.example.array;

public class MethodExample3 {
    public static void main(String[] args) {
        int[] array = {6, 25, 91, 23, 72, 9, 18, 6};
        int n = 23;
        boolean m = false;
        for (int x : array) {
            if (n == x) {
                m = true;
                break;
            }
        }
        System.out.println(m);

    }
}
