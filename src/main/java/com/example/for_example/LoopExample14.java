package com.example.for_example;

import java.util.Scanner;

public class LoopExample14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
        int a = 10;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == 0 || i == 9 || j % 2 == 0)
                    System.out.print("(" + i + "," + j + ") ");
                else System.out.print("      ");
            }
            System.out.println();
        }
    }
}
