package com.example.stream;

import java.util.Arrays;
import java.util.List;

// multi array 1 ta massivga otkazish;
public class StreamExample4 {
    public static void main(String[] args) {
        Integer[][] array = {{1, 2}, {3, 4, 5, 6}, {7, 8, 9}};
        Arrays.stream(array).flatMap(Arrays::stream).forEach(System.out::println);
    }
}
