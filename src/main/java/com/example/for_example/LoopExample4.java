package com.example.for_example;

import java.util.Scanner;

public class LoopExample4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=i*i;
        }
        System.out.println(sum);
    }
}
