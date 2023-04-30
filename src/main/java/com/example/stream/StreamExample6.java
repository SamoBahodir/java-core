package com.example.stream;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class StreamExample6 {
    public static void main(String[] args) {
        Character[] array = {'d', 'a', 's', 't', 'u', 'r', 'l', 'a', 's', 'h', '.', 'u', 'z'};
        Stream<Character> collect = Arrays.stream(array);
        String collect1 = collect.collect(Collector.of(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append,
                StringBuilder::toString
        ));
        System.out.println(collect1);
    }
}
