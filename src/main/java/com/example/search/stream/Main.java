package com.example.search.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var a= Stream.of(1,2,3,4,5);
        var result= a.collect(Collectors.partitioningBy(n -> n % 2!=0));
        System.out.println(result);
    }
}
