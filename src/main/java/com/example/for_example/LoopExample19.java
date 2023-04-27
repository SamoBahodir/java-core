package com.example.for_example;

import java.util.Scanner;

public class LoopExample19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 5/*scanner.nextInt()*/;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i>=j)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
