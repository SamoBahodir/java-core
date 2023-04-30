package com.example.stream;

import java.util.stream.IntStream;

public class StreamExample9 {
    public static void main(String[] args) {
        String[] array = {"Alish", "Valish", "Toshmat", "Eshmat", "Lashara"};
        IntStream.range(0, array.length).forEach(value -> System.out.println(value + " " + array[value]));
    }
}
