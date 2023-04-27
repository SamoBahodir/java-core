package com.example.for_example;

import java.util.Scanner;

public class LoopExample29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 5/*scanner.nextInt()*/;
        for (int i = 0; i < a; i++) {

            for (int k = 0; k < a - i - 1; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < a; j++) {
                if (i == 0 || i == a - 1 || j == 0 || j == a - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
