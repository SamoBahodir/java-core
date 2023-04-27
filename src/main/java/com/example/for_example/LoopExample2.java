package com.example.for_example;

import java.util.Scanner;

public class LoopExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = a;
        int kopaytma = a;
        int lastKopaytma = a;
        for (int i = 1; i < n; i++) {
            kopaytma = kopaytma * 10;
            lastKopaytma += kopaytma;
            sum = sum + lastKopaytma;
        }
        System.out.println(sum);
    }
}
