package com.example.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMap {
    public static void main(String[] args) {
        // flatMap usuli bir nechta toplamlar bolsa shu toplamni bitta toplam qilib beradi;

        Stream.of(Arrays.asList(1, 2, 4), Arrays.asList(5, 3, 6), Arrays.asList(9, 7, 8))
                .flatMap(Collection::stream).forEach(System.out::print);

        Stream.<String>builder().add("A").add("B").add("C").add("D").build()
                .forEach(s -> System.out.println(" bitta toplam qilib beradi: "+s));
    }

}
