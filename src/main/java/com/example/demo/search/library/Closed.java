package com.example.demo.search.library;

public class Closed {//shkaf
    private Shelf[] shelf = new Shelf[6];
    private String name;

    public Closed(String name) {
        this.name = name;
        for (int i = 0; i < 6; i++) {
            this.shelf = new Shelf[i];
        }
    }

}
