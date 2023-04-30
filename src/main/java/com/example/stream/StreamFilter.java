package com.example.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        // filter usuli elementlarni shat boyicha ishlatiladi;
        Integer[] numbers = {1, 5, 5, 3, 8, 9, 4, 2, 6, 4, 3, 8, 7};
        int a = 5;
        Stream<Integer> stream = Arrays.stream(numbers);
        stream.filter(integer -> integer
                < a).forEach(n -> System.out.println("royhatdan " + a + " dan kichiklarini yoki "+a+" dan kattalarini konsulga chiqarish: " + n));
    }
}
