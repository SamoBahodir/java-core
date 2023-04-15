package com.example.demo.search.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMap {
    public static void main(String[] args) {
        // flatMap usuli bir nechta toplamlar bolsa shu toplamni bitta toplam qilib beradi;
        List<Integer> bir = Arrays.asList(1, 2, 4);
        List<Integer> ikki = Arrays.asList(5, 3, 6);
        List<Integer> uch = Arrays.asList(9, 7, 8);
        Stream<List<Integer>> system = Stream.of(bir, ikki, uch);
//        system.flatMap(Collection::stream).forEach(System.out::println);
        Stream<String> strings = Stream.<String>builder().add("A").add("B").add("C").build();
        System.out.println(strings.collect(Collectors.toList()));
    }

}
