package com.example.collection;

import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.add("bir");
        System.out.println(stack);
        stack.push("ikki");
        System.out.println(stack);
        stack.add("uch");
        System.out.println(stack);
    }
}
