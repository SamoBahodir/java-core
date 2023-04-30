package com.example.stream;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {

        Integer[] a = {5, 13, 4, 21, 13, 27, 2, 59, 59, 34};
        var numList = Arrays.stream(a).collect(Collectors.toCollection(ArrayDeque::new)).descendingIterator();
        while (numList.hasNext())
            System.out.print(numList.next()+", ");

    }
}
