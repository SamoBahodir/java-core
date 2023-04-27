package com.example.search.for_lop;

public class TupNumber {
    public static void main(String[] args) {
        int a = 133;
        int count = 0;
        int temp = a;
        int m = 0;
        int numberLenght = 0;
        for (; temp != 0; temp = temp / 10) {
            m = temp % 10;
            numberLenght++;
        }
        System.out.println(numberLenght);

//        for (int i = 1; i <= a; i++) {
//            if (a % i == 0) {
//                count++;
//            }
//        }
//        if (count == 2) {
//            System.out.println(true);
//        } else System.out.println(false);
    }
}
