package com.example.for_example;

import java.util.Scanner;

public class LoopExample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        if (a == sum) {
            System.out.println("true");
        } else System.out.println("false");
    }
}
