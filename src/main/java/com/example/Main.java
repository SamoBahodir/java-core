package com.example;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 1).limit(10).forEach(System.out::println);
        System.out.println("------------------");
        IntStream.range(0, 10).forEach(System.out::println);
    }
}
