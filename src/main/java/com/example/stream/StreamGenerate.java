package com.example.stream;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamGenerate {

    public static void main(String[] args) {
        int a = 5, number = 1, number1 = 3;
        char ch = '.';
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));

        Stream.generate(() -> "Java").limit(a)
                .forEach(s -> System.out.println("limit boyicha chiqarish" + s));//limit boyicha chiqarish

        Stream.iterate(40, n -> n + 2).limit(a)
                .forEach(s -> System.out.println("limit boyicha chirish 2 qoshib: " + s));//limit boyicha chirish 2 qoshib

        IntStream.range(number, number1)
                .forEach(s -> System.out.println(number + " dan " + number1 + " gacha chiqarish:" + s));//1 dan berilgan songacha chiqarish

        LongStream.rangeClosed(number, number1)
                .forEach(s -> System.out.println(number + " dan " + number1 + " ni ham chiqarish:" + s));//1dan berilgan sonniham chiqarish

        Pattern.compile(". ").splitAsStream("a. b. c")
                .forEach(s -> System.out.println("orasidagi [" + ch + "] olib tashlash: [" + s + "]"));//orasidagi belgini olib tashlash

        Stream.of("a", "b", "b", "c").filter(element -> element.contains("b")).findAny()
                .ifPresent(System.out::println); //royhat orasidan soralgan elementni birinchi kelganini olish

        Stream.of("a", "b", "b", "c").filter(element -> element.contains("b"))
                .findFirst().ifPresent(System.out::println);//royhat orasidan soralgan elementni birinchi kelganini olish

        Stream.of("abcd", "bbcd", "cbcd").skip(2)
                .forEach(System.out::println);//belgilangan size gacha tashlab qolganini chiqarib beradi

        Stream.of("test", "test1", "test2", "test3").skip(1).map(element -> element.substring(0, 3))
                .forEach(System.out::println);//kesib olish

        productList.stream().map(Product::getId).toList()
                .forEach(System.out::println);

        productList.stream().map(Product::getName).toList()
                .forEach(System.out::println);

        String collect = productList.stream().map(Product::getName)
                .collect(Collectors.joining(",", "[", "]")); //name boyicha roxhat yaratish
        System.out.println("name boyicha roxhat yaratish: " + collect);

        Double averagingInt = productList.stream()
                .collect(Collectors.averagingInt(Product::getId));//ortacha qiymat
        System.out.println("ortacha qiymat: " + averagingInt);

        Integer mapToInt = productList.stream().mapToInt(Product::getId).sum(); //yigindisi
        System.out.println("sum: " + mapToInt);

        IntSummaryStatistics statistics = productList.stream()
                .collect(Collectors.summarizingInt(Product::getId));//Statistic
        System.out.println("Statistic: count = " + statistics.getCount() +
                ",  sum = " + statistics.getSum() +
                ",  min = " + statistics.getMin() +
                ",  max = " + statistics.getMax() +
                ",  average = " + statistics.getAverage());

        Map<Boolean, List<Product>> mapPartioned = productList.stream()
                .collect(Collectors.partitioningBy(element -> element.getId() > 15));
        System.out.println("partitioningBy: " + mapPartioned);

        Set<Product> unmodifiableSet = productList.stream()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        Collections::unmodifiableSet));
        System.out.println("unmodifiableSet: " + unmodifiableSet + ", ");

        IntStream.range(1, 6).parallel().forEach(s -> System.out.print("parallel: " + s + ", "));

    }
}