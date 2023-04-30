package com.example.stream;

import java.util.Arrays;

public class StreamExample8 {
    public static void main(String[] args) {
        String[] array = {"Ali", "Vali", "Toshmat", "Eshmat", "Mazgi"};
        var optional = Arrays.stream(array).findFirst();
        if (optional.isPresent())
            System.out.println(optional.get());
        var optional1 = Arrays.stream(array).reduce((s, s2) -> s2);
        System.out.println(optional1.get());
    }
}
