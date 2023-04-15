package com.example.demo.search.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamGenerate {
    private static long counter;

    private static void wasCalled() {
        counter++;
    }

    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));
//        Stream.generate(() -> "Java").limit(10).forEach(System.out::println);//limit boyicha chiqarish
//        Stream.iterate(40, n -> n + 2).limit(5).forEach(System.out::println);//limit boyicha chirish 2 qoshib
//        IntStream.range(1, 3).forEach(System.out::println);//1 dan berilgan songacha chiqarish
//        LongStream.rangeClosed(1, 3).forEach(System.out::println);//1dan berilgan sonniham chiqarish
//        Pattern.compile(". ").splitAsStream("a. b. c").forEach(System.out::println);//orasidagi belgini olib tashlash
//        Stream.of("a", "b","b", "c").filter(element -> element.contains("b")).findAny().ifPresent(System.out::println); //royhat orasidan soralgan elementni birinchi kelganini olish
//        Stream.of("a", "b","b", "c").filter(element -> element.contains("b")).findFirst().ifPresent(System.out::println);//royhat orasidan soralgan elementni birinchi kelganini olish
//        Stream.of("abcd", "bbcd", "cbcd").skip(2).forEach(System.out::println);//belgilangan size gacha tashlab qolganini chiqarib beradi
//        Stream.of("test", "test1", "test2", "test3").skip(1).map(element -> element.substring(0, 3)).forEach(System.out::println);//kesib olish
//        productList.stream().map(Product::getId).toList().forEach(System.out::println);
//        productList.stream().map(Product::getName).toList().forEach(System.out::println);
//        String collect = productList.stream().map(Product::getName).collect(Collectors.joining(",", "[", "]"));//name boyicha roxhat yaratish
//        Double averagingInt = productList.stream().collect(Collectors.averagingInt(Product::getId));//ortacha qiymat
//        Integer mapToInt = productList.stream().mapToInt(Product::getId).sum(); //yigindisi
//        IntSummaryStatistics statistics = productList.stream().collect(Collectors.summarizingInt(Product::getId));//Statistic
//        Map<Boolean, List<Product>> mapPartioned = productList.stream().collect(Collectors.partitioningBy(element -> element.getId() > 15));
//        Set<Product> unmodifiableSet = productList.stream()
//                .collect(Collectors.collectingAndThen(Collectors.toSet(),
//                        Collections::unmodifiableSet));
         IntStream.range(1, 6).parallel().forEach(System.out::println);

    }
}

class Product {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(Integer id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}