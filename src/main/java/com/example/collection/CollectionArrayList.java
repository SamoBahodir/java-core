package com.example.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionArrayList {
    public static void main(String[] args) {
        String[] array1 = {"bir", "ikki", "uch", "to'rt"};
        String[] array2 = {"ikki", "uch"};
        List<String> toplam1 = new ArrayList<>(Arrays.asList(array1));
        List<String> toplam2 = new ArrayList<>(Arrays.asList(array2));
        System.out.println("toplam1: " + toplam1);
        System.out.println("toplam2: " + toplam2);
        royxatniTaxrirlash(toplam1, toplam2);
        System.out.println("royxatniTaxrirlash: " + toplam1);

    }
    private static void royxatniTaxrirlash(
            Collection<String> toplam1,
            Collection<String> toplam2) {
        toplam1.removeIf(toplam2::contains);
    }
}
