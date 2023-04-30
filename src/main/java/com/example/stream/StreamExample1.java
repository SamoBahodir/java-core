package com.example.stream;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamExample1 {
    public static void main(String[] args) {

        Integer[] a = {5, 13, 4, 21, 13, 27, 2, 59, 59, 34};
        Set<Integer> numSet = new HashSet<>();
        List<Integer> numList = Arrays.stream(a)
                .filter(num -> !numSet.add(num))
                .distinct().toList();
        System.out.println(numList);

    }
}
