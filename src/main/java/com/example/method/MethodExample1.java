package com.example.method;

public class MethodExample1 {
    public static void main(String[] args) {
        Main main = new Main();
        String text = "dasturlash.uz";
        show(text);//1
        main.show(text);//2
    }

    public static void show(String text) {
        System.out.println(text);
    }
}
