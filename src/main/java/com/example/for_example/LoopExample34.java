package com.example.for_example;

public class LoopExample34 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i > j) {
                    System.out.print(" ");
                } else {
                    if (i == 0 || i == j || j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }

    }
}
