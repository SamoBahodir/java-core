package com.example.search.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class StreamSorted {
    public static void main(String[] args) {
        // sorted usuli elementlarni tartiblash uchun ishlatiladi;
        Integer[] numbers = {1, 32, 5, 7, 6, 3, 2, 9, 4, 11, 8};
        Arrays.stream(numbers).sorted().forEach(System.out::println);//number uchun
        List<String> list = Arrays.asList("Valish", "Alish", "Toshmat", "Eshmat", "Axmoq");
        list.stream().sorted(String::compareTo).forEach(System.out::println); //String uchun
        List<Student> students = new LinkedList<>();
        students.add(new Student(15, "Java"));
        students.add(new Student(15, "C++"));
        students.add(new Student(15, "C"));
        students.add(new Student(15, "Java"));
        Comparator<Student> comparator = (o1, o2) -> {
            int i = o1.getAge().compareTo(o2.getAge());
            if (i == 0) {
                return o1.getLang().compareTo(o2.getLang());
            }
            return i;
        };
        students.stream().sorted(comparator).toList().forEach(System.out::println);

    }
}

class Student {
    private Integer age;
    private String lang;

    public Student(Integer age, String lang) {
        this.age = age;
        this.lang = lang;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", lang='" + lang + '\'' +
                '}';
    }
}