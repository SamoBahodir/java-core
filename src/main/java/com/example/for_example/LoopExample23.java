package com.example.for_example;

import java.util.Scanner;

public class LoopExample23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i>=j)
                    System.out.print(i);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
