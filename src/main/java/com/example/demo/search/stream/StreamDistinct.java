package com.example.demo.search.stream;

import java.util.LinkedList;
import java.util.List;

public class StreamDistinct {
    public static void main(String[] args) {
        // distinct usuli oxshash elementlarni olib tashlaydi;
        List<String> list=new LinkedList<>();
        list.add("Alish");
        list.add("Valish");
        list.add("Alish");
        list.add("Valish");
        list.add("Alish");
        list.add("Toshmat");
        list.stream().distinct().forEach(System.out::println);
    }
}
