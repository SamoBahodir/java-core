package com.example.demo.search.for_lop;

public class RaqamlarYigindisi {
    public static void main(String[] args) {
        int a = 135;
        int i = a;
        int count = 0;

        for (; i != 0; i = i / 10) {
            count = count + i % 10;
        }
        System.out.println(count);
    }
}
