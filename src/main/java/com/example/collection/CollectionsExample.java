package com.example.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(9, 9, 9, 9, 1, 1, 1, 2, 3, 3);
        System.out.println(eq(1, 2));
        int frequency = frequency(array, 1);
        System.out.println(frequency);
    }

    static boolean eq(Object o1, Object o2) {
        return o1 == null ? o2 == null : o1.equals(o2);
    }

    public static int frequency(Collection<?> c, Object o) {
        int result = 0;
        if (o == null) {
            for (Object e : c)
                if (e == null)
                    result++;
        } else {
            for (Object e : c)
                if (o.equals(e))
                    result++;
        }
        return result;
    }

}
