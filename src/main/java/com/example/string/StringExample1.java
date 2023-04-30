package com.example.string;

public class StringExample1 {
    public static void main(String[] args) {
        String test = "Dasturlash";
        char c = 'D';
        char c1 = 't';
        char[] chars = test.toCharArray();
        for (int x = 0; x < chars.length; x++)
            if (chars[x] == c)
                System.out.println("D: " + x + " " + Character.valueOf(c).hashCode());
            else if (chars[x] == c1)
                System.out.println("t: " + x + " " + Character.valueOf(c1).hashCode());

    }
}
