package com.example.java;

import java.text.NumberFormat;
import java.util.Locale;

public class Currency {
    public static void main(String[] args) {
        Locale.setDefault(Locale.FRANCE);
        String format = NumberFormat.getCurrencyInstance().format(42.2);
        System.out.println(format);
    }
}
