package com.example.stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamClass {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        strings.add("test1");
        strings.add("test2");
        strings.add("test");
        strings.add("test3");
        Integer[] numbers = {1, 4, 3, 6, 4, 2, 8, 6};
        Optional<Integer> result = Arrays.stream(numbers).reduce((integer, integer2) -> integer += integer2);
        System.out.println("reduce: "+result.get());

        Stream.generate(() -> "Java test").limit(5).forEach(s -> System.out.println("limit: "+s));

        IntStream intStream = IntStream.concat(IntStream.of(1), IntStream.of(11));

        intStream.forEach(i -> System.out.println("concat: " + i));

        Optional<String> min = strings.stream().min(Comparator.comparingInt(String::length));
        System.out.println(min.get());
    }

}