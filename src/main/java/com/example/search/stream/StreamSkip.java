package com.example.search.stream;

import java.util.Arrays;
import java.util.List;

public class StreamSkip {
    public static void main(String[] args) {
        //skip usuli boshlangich qitymatni olib tashlaydi;
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.stream(numbers).skip(3).toList().forEach(System.out::println);
        List<Integer> integers= Arrays.stream(numbers).skip(3).toList();
        System.out.println(integers);
    }
}
