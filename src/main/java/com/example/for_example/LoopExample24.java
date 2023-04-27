package com.example.for_example;

import java.util.Scanner;

public class LoopExample24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 5/*scanner.nextInt()*/;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k < a; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
