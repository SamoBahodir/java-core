package com.example.method;

public class MethodExample6 {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', ' ', 'u', 'c', 'h', 'u', 'n'};
        convertToString(chars);
        String s = convertToString2(chars);
        System.out.println(s);
    }

    private static void convertToString(char[] chars) {
        StringBuilder text = new StringBuilder();
        for (char c : chars) {
            text.append(c);
        }
        System.out.println(text);
    }

    private static String convertToString2(char[] chars) {
        String text = "";
        for (char c : chars) {
            text += c;
        }
        return text;
    }
}
