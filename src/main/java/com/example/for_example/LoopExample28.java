package com.example.for_example;

import java.util.Scanner;

public class LoopExample28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 5/*scanner.nextInt()*/;
        for (int i = a; i > 0; i--) {
            for (int k = i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = a; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
