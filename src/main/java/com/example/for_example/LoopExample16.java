package com.example.for_example;

import java.util.Scanner;

public class LoopExample16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j == i)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
