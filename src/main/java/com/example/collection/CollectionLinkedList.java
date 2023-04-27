package com.example.collection;


import java.util.*;

public class CollectionLinkedList {
    public static void main(String[] args) {
        String[] rayxat1 = {"bir", "ikki", "uch", "to'rt", "besh"};
        String[] rayxat2 = {"olti", "yetti", "sakkiz", "to'qqiz"};
        List<String> toplam1 = new LinkedList<>(Arrays.asList(rayxat1));
        List<String> toplam2 = new LinkedList<>(Arrays.asList(rayxat2));
        toplam1.addAll(toplam2);
        System.out.println(toplam1);
//        royxatniKorsatish(toplam1);
//        royxatniOchrish(toplam1, 2, 4);
//        System.out.println(toplam1);
        royxatniAylantirish(toplam1);
//        System.out.println(toplam1);


    }

    private static void royxatniAylantirish(List<String> toplam1) {
        ListIterator<String> it= toplam1.listIterator(toplam1.size());
        while (it.hasPrevious())
            System.out.printf("%s ,",it.previous());
    }

    private static void royxatniOchrish(List<String> toplam1, int i, int i1) {
        toplam1.subList(i,i1).clear();
        System.out.println(toplam1);
    }

    private static void royxatniKorsatish(List<String> toplam1) {
        for (String x : toplam1)
            System.out.printf("%s " ,x);
        System.out.println();
    }
}
