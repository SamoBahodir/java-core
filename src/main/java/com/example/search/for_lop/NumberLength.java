package com.example.search.for_lop;

public class NumberLength {
    public static void main(String[] args) {
        int a = 133;
        int temp1 = a;
        int numberLength = 0;
        for (; temp1 != 0; temp1 = temp1 / 10) {
            numberLength++;
        }
        System.out.println(numberLength);
    }
}
