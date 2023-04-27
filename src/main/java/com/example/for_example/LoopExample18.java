package com.example.for_example;

import java.util.Scanner;

public class LoopExample18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (j == a - i)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();

    }
}
}
