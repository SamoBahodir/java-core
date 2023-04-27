package com.example.method;

public class MethodExample2 {
    public static void main(String[] args) {
        Main main = new Main();
        int number = 5;
        String text = "dasturlash.uz";
        intAndString(number, text);
        main.twoType(number, text);
    }

    private static void intAndString(int number, String text) {
        System.out.println("number: " + number + ", text: " + text);
    }
}
