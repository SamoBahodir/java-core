package com.example.demo.search.for_lop;

public class TeskariSon {
    public static void main(String[] args) {
        int a = 12345, count = 0, temp, m = 0;
        for (; a != 0; ) {
            temp = a % 10;
            count = count * 10 + temp;
            a = a / 10;
        }
        System.out.println(count);
    }
}

class TeskariSon2 {
    public static void main(String[] args) {
        int a = 12321, count = 0, temp ,m=a;
        for (; a != 0; ) {
            temp = a % 10;
            count = count * 10 + temp;
            a = a / 10;
        }
        if (count == m) {
            System.out.println(true);
        } else System.out.println(false);
    }
}