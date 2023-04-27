package com.example.for_example;

import java.util.Scanner;

public class LoopExample26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 5;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i==j)
                    System.out.print("*");
                else if(i>j) System.out.print("-");
                else if (i<j) System.out.print("+");
            }
            System.out.println();
        }
    }
}
