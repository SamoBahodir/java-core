package com.example.demo.collection;

import java.util.ArrayList;

public class CollectionArrayList {
    public static void main(String[] args) {
        ArrayList<String> color_list = new ArrayList<String>(5);

        color_list.add("White");
        color_list.add("Black");
        color_list.add("Red");
        color_list.add("White");
        color_list.add("Yellow");
        color_list.add(2, "white");
        System.out.println("Size of the color_list: " + color_list);

        // Print the colors in the list
        for (String value : color_list) {
            System.out.println("Color = " + value);
        }
        // Create an array from the ArrayList
        String[] color_list2 = new String[color_list.size()];
        color_list2 = color_list.toArray(color_list2);

        // Display the contents of the array
        System.out.println("Printing elements of color_list2:");
        for (String color : color_list2) {
            System.out.println("Color = " + color);
        }
    }

}
