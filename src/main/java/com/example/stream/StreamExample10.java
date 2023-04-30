package com.example.stream;

import java.util.List;

public class StreamExample10 {
    public static void main(String[] args) {
        String text = "Dasturlash.uz";
        List<Character> collect = text.chars().mapToObj(value -> (char) value).toList();
        System.out.println(collect);
    }
}
