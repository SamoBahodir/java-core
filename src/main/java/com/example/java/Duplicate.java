package com.example.java;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        String[] duplicate = {"Java", "Android", "kotlin", "kotlin", "Java"};
        Integer[] numbers={1,2,3,3,5,6,7,5};
//        genericMethode(duplicate);
        genericMethode(numbers);
    }

    private static <T>void genericMethode(T[] duplicate) {

        boolean isDuplicateFound = false;
        StringBuilder builder = new StringBuilder();
        System.out.println(Arrays.toString(duplicate) + "\n");
        for (int i = 0; i < duplicate.length; i++) {
            for (int j = i + 1; j < duplicate.length; j++) {
                if (duplicate[i].equals(duplicate[j])) {
                    isDuplicateFound = true;
                    builder.append(duplicate[i]).append(", ");
                }
            }
        }
        System.out.print("Duplicate Element is: " + builder);
        if (!isDuplicateFound) {
            System.out.println("Duplicate note fount:");
        }
    }
}
