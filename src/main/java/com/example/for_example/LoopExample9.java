package com.example.for_example;

public class LoopExample9 {
    public static void main(String[] args) {
        int n = 12321;
        int m=n;
        int temp;
        int reverseNum = 0;

        for (; n != 0; ) {
            temp = n % 10;
            reverseNum = reverseNum * 10 + temp;
            n = n / 10;
        }
        System.out.println(m==reverseNum);
    }
}
