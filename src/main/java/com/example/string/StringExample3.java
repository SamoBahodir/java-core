package com.example.string;

public class StringExample3 {
    public static void main(String[] args) {
        String text = "Dasturlash";
        for (int i =0; i < text.length(); i+=2) {
            String substring = text.substring(i, i + 2);
            System.out.println(substring);
        }
    }
}
