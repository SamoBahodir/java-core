package com.example.method;

public class MethodExample4 {

    public static void main(String[] args) {
        Main main = new Main();
        int a = 4, b = 5;
        int sum = perim(a, b);
        int sum1 = main.perim(a, b);
        System.out.println(sum);

    }

    private static int perim(int a, int b) {
        return (2 * (a + b));
    }
}
