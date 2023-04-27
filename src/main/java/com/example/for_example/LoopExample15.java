package com.example.for_example;

import java.util.Scanner;

public class LoopExample15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
        int a = 10;
        int count = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.printf("%d\t", count);
                count++;

            }
            System.out.println();
        }

    }
}
