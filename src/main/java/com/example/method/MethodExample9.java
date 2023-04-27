package com.example.method;

public class MethodExample9 {
    public static void main(String[] args) {
        int number = 1253;
        total(number);
    }

    private static void total(int number) {
        int total = 0;
        while (number!=0){
            total += number % 10;
        number=number/10;}
        System.out.println(total);
    }

}
