package com.example.method;

public class MethodExample3 {
    public static void main(String[] args) {
        int x = 5, y = 5;
        Main main = new Main();
        main.twoType(x, y);
        twoType(x, y);
    }

    public static void twoType(int x, int y) {
        System.out.println(x + y);
    }
}
