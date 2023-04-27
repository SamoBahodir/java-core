package com.example.for_example;

import java.util.Scanner;

public class LoopExample12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= a; j++) {
                System.out.print("("+i+","+j+") ");
            }
            System.out.println();
        }
    }
}
