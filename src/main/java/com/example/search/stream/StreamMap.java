package com.example.search.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        String [] arrays={"bir","ikki","uch","tort","besh"};
        Stream<String > stream= Arrays.stream(arrays);
//        stream.map(String::length).forEach(System.out::println);
//        stream.map(String::trim).forEach(System.out::println);
//        stream.map(String::strip).forEach(System.out::println);
        stream.map(s -> s+"olti").forEach(System.out::println);
//        stream.map(String::trim).forEach(System.out::println);
//        stream.map(String::trim).forEach(System.out::println);
//        stream.map(String::trim).forEach(System.out::println);
    }
}
