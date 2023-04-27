package com.example.search.for_lop;

public class Fibanatchi {
    public static void main(String[] args) {
        int N = 10;
        Fibonacci(N);
    }

    static void Fibonacci(int N) {
        int num1 = 0, num2 = 1, count = 0;
        int counter = 0;
        while (counter < N) {
            System.out.println(num1 + " ");
            count = count + num1;
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        System.out.println( "count: "+count);
    }


}
