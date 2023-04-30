package com.example.stream;

public class StreamExample {
    public static void main(String[] args) {
        String test = "ataylab";
        char c = 'a';
        System.out.println(test.chars().filter(value -> value == c).count());
    }
}
