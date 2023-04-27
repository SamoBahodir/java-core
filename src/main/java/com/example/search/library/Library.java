package com.example.search.library;

public class Library {
    private Floor[] floors;//qavatlar

    public Library(Floor[] floors) {
        this.floors = new Floor[3];
        for (int i = 0; i < 3; i++) {
            this.floors[i] = new Floor();
        }
    }

    public boolean add(Book book, int floor, String closed, int shelf) {

        return false;
    }

    public boolean contains(int floor, String closed, int shelf, Book book) {
        return false;
    }

    public String getBooks(int floor, String closed) {
        return "";
    }

    public Book find(String author, String title) {
        return null;
    }
}
