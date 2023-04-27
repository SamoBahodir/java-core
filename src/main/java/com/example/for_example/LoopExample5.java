package com.example.for_example;

import java.util.Scanner;

public class LoopExample5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int division= scanner.nextInt();
//        int division = 163;
        int number = division;
        int sum = 0;
        int length = String.valueOf(division).length();
        for (; division != 0; ) {
            int multiplication = 1;
            int odd = division % 10;
            for (int i = 0; i < length; i++) {
                multiplication *= odd;
            }
            sum += multiplication;
            division = division / 10;
        }

        System.out.println("sum = " + sum);
        System.out.println("result = " + (number == sum));
    }
}
