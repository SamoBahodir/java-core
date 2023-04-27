package com.example.java;

public class Sort {
    public static void main(String[] args) {
        int[] number = {1, 4, 3, 6, 2, 7, 5, 9, 8};
        extracted(number);
    }

    private static <T> void extracted(int[] numbers) {
        for (int x : numbers)
            System.out.print(x + " ");
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            int temp;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }

        }

        System.out.println("Sorted Element array");
        for (int k : numbers)
            System.out.print(k + " ");
    }
}
