package com.example.for_example;

public class LoopExample10 {
    public static void main(String[] args) {
        int a = 10;
        double sum = 0;
        for (double i = 1; i <= a; i++) {
            sum += 1 / i;
        }
        System.out.println(sum);
    }
}
