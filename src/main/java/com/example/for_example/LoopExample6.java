package com.example.for_example;

import java.util.Scanner;

public class LoopExample6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count=0;
        for (int i = 1; i <= number; i++)
                if (number % i == 0)
                    count++;
        System.out.println(count==2);
    }
}
