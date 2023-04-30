package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamSkip {
    public static void main(String[] args) {
        //skip usuli boshlangich qitymatni olib tashlaydi;
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<String> list=new ArrayList<>();
        list.add("Laziz");
        list.add("Aziz");
        list.add("Said");
        list.add("Hamid");
        Arrays.stream(numbers).skip(3).toList().forEach(System.out::println);
        List<Integer> integers= Arrays.stream(numbers).skip(3).toList();
        Optional<String> optionalS=list.stream().skip(list.size()-1).findFirst();
        System.out.println(optionalS.get());
        System.out.println(integers);
    }
}
