package com.example.method;

public class MethodExample11 {
    public static void main(String[] args) {
        int a = 3, b = 4;
        test(a, b);
    }
    public static void test(int a, int b) {
        int c = (a * a) + (b * b);
        System.out.println(Math.sqrt(c));
    }
}
