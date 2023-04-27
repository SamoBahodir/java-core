package com.example.for_example;

import java.util.Scanner;

public class LoopExample1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int daraja=scanner.nextInt();
        int count=1;
        for (int i = 0; i < daraja; i++) {
            count*=a;
        }
        System.out.println(a+" sonning "+daraja+" darajasi = "+count);
    }
}
