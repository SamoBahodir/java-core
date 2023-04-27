package com.example.method;

public class MethodExample7 {
    public static void main(String[] args) {
        int number = 1;
        String s = manfiyAndMusbat(number);
        System.out.println(s);
    }

    private static String manfiyAndMusbat(int number) {
        return number < 0 ? "musbat" : "manfiy";
    }
}
