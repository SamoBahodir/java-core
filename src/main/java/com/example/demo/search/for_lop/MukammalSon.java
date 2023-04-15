package com.example.demo.search.for_lop;

import java.util.Scanner;

public class MukammalSon {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        int count = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                count += i;
            }
        }
        if (count == a) {
            System.out.println(true);
        } else System.out.println(false);
    }
}
