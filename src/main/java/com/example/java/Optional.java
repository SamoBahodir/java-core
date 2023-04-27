package com.example.java;

public class Optional {
    public static void main(String[] args) throws Exception {

        DeveloperOptional developer = new DeveloperOptional("samo", "c++");
        String lang = developer.lang;
        String name = developer.name;
        System.out.println(lang);
        System.out.println(name);
    }
}
