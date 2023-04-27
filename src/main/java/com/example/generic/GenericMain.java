package com.example.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMain {
    public static void main(String[] args) {
//        List<String> list=new ArrayList<>();
        GenericList<String> list=new GenericList<>();
        list.add("add");
        list.add("add");
        list.add("add");
        list.add("add");
        list.add("add");
        list.add("add");
        list.add("add");
        list.add("add");
        list.add("add");

        System.out.println(list.get(1));

//        Integer[] number = {1, 2, 3, 4, 34, 65, 5, 7, 89};
//        Character[] letters = {'J', 'A', 'V', 'A', 'N', 'Z'};
//        String[] names = {"Abror", "Jamshid", "Mansur", "Jasur", "Obid"};
//        System.out.println(genericMethodReturn(number));
//        System.out.println(genericMethodReturn(letters));
//        System.out.println(genericMethodReturn(names));
//        genericMethodVoid(names);
//        genericMethodVoid(letters);
//        genericMethodVoid(number);
    }


    //return qaytaradigan generic method
    @SafeVarargs
    private static <T extends Comparable<T>> T genericMethodReturn(T... generic) {
        Arrays.sort(generic);
        return generic[generic.length - 1];
    }

    // void hech qandey malumot qaytmaydigan method
    private static <T> void genericMethodVoid(T[] value) {
        for (T t : value)
            System.out.printf("%s ", t);
        System.out.println();
    }
}