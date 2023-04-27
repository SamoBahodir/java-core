package com.example.method;

public class MethodExample15 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        surface(a, b, c);
    }

    private static void surface(int a, int b, int c) {
        var p = (a + b + c) / 2;
        var S = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("P: " + p);
        System.out.println("S: " + S);
    }
}
