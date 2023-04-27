package com.example.for_example;

import java.util.Scanner;

public class LoopExample7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(String.valueOf(number).length());//1-variant
        int count = 0;
        for (int temp = number; temp != 0; temp = temp / 10) {//2-variant
            count++;
        }
        System.out.println(count);
    }
}
