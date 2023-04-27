package com.example.for_example;

import java.util.Scanner;

public class LoopExample30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 5;
        for (int i = 1; i <= a; i++) {

            for (int k = 0; k <= a-i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
            System.out.println();
            }
        }
}
