package com.example.for_example;

import java.util.Scanner;

public class LoopExample27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i == j || i == a - j + 1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
