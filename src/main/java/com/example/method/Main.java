package com.example.method;

class Main {

    // Overloading
    public void show() {
        System.out.println("Dasturlash.uz");
    }

    // Overloading
    public void show(String text) {
        System.out.println(text);
    }

    // Overloading
    public void twoType(int number, String text) {
        System.out.println("number: " + number + ", text: " + text);

    }

    // Overloading
    public void twoType(int x, int y) {
        System.out.println(x + y);
    }

    public int perim(int a, int b) {
        return (2 * (a + b));
    }
}