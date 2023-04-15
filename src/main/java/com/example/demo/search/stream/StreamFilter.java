package com.example.demo.search.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        // filter usuli elementlarni filterlash uchun ishlatiladi;


        Integer [] numbers={1,5,5,3,8,9,4,2,6,4,3,8,7};
        Stream<Integer> stream= Arrays.stream(numbers);
       stream.filter(integer -> integer
                < 5).forEach(System.out::println);
    }
}
