package com.example.for_example;

import java.util.Scanner;

public class LoopExample8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n=scanner.nextInt();
        int n = 315;
        int sum = 0;
        for (int temp = n; temp != 0; temp = temp / 10) {
            sum+=temp%10;
        }
        System.out.println(sum);
    }
}
