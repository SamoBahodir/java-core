package com.example.java;


import java.util.Objects;

public class Ternary  {

    public static void main(String[] args) {
        String b = "not empty";
        TernaryTest test = new TernaryTest();
        test.test(b);
        test.test(null);

    }
}
class TernaryTest {

    public void test(String b) {
        var optional = Objects.requireNonNullElse(b, "it's empty");
        System.out.println(optional);
    }
}