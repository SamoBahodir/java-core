package com.example.demo.java;

public class Main {
    public static void main(String[] args) {
        int a = 15, b = 10;
        int d = 7;
        if (a > b && a > d && b > d) {
            System.out.println("d: " + d);
        } else if (b > a && b > d && d > a)
            System.out.println("a: " + a);
        else System.out.println("b :" + b);
    }
}
