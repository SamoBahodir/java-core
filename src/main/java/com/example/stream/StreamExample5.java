package com.example.stream;

import java.util.Arrays;

// multi array 1 ta massivga otkazish va 15 dan kattalarini ekranga chiqarish;
public class StreamExample5 {
    public static void main(String[] args) {
        Integer[][] numbers = {{11, 5}, {31, 14, 35, 8}, {9, 17, 20}};
        Arrays.stream(numbers)
                .flatMap(Arrays::stream)
                .filter(number -> number > 15)
                .peek(System.out::println).toList();
    }
}
