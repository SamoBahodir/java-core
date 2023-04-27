package com.example.java;
import static java.util.Optional.ofNullable;
public class DeveloperOptional {
    String name;
    String lang;
    public DeveloperOptional(String name,String lang) {
        this.name=ofNullable(name).orElse("Default name: duke");
        this.lang=ofNullable(lang).orElse("Default language: java");
    }
}
