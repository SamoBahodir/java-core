package com.example.java;

public interface InterfaceExample {
    void a();

    static void s() {
        System.out.println("s method");
    }

    private void b() {
        System.out.println("interface ichida private method");
    }

    default void d() {
        System.out.println("interface ichida default method");

    }

}

class Main implements InterfaceExample {
    public static void main(String[] args) {
        Main main = new Main();
        InterfaceExample.s();
        main.a();
        main.d();
    }

    @Override
    public void a() {
        System.out.println("a method");
    }

    @Override
    public void d() {
//        InterfaceExample.super.d();
        System.out.println("b method");
    }
}