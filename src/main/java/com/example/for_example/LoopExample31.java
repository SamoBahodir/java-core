package com.example.for_example;

import java.util.Scanner;

public class LoopExample31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 5;
        for (int i = 0; i <= a; i++) {

            for (int k = a; k >= 0; k--) {
                if (k>=i)
                    System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                 System.out.print(" ");
            }

            System.out.println();
        }
    }
}
