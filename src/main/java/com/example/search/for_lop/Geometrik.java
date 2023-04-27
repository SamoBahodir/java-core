package com.example.search.for_lop;

import java.util.Scanner;

public class Geometrik {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(" (" + i + "," + j + ")");
            }
            System.out.println("\n");
        }
    }
}

class C {
    public static void main(String[] args) {
        int a = 10;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == 0 || i == 9 || j %2==0) {
                    System.out.print(" (" + i + "," + j + ")");

//
                }else System.out.print("      ");
            }
            System.out.println();
        }
    }
}
class Sonlar {
    public static void main(String[] args) {
        int a=10;
        for (int i = 1; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i==0)
                System.out.print(j);
            }
        }
    }
}