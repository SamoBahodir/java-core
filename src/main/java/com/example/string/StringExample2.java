package com.example.string;

import java.util.Locale;

public class StringExample2 {
    public static void main(String[] args) {
        String test = "Dasturlash";
        String test1 = "DasturlasH";
        System.out.println(test.toUpperCase(Locale.ROOT).equals(test1.toUpperCase(Locale.ROOT)));

    }
}
