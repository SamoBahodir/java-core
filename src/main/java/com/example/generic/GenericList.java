package com.example.generic;

public class GenericList<T> {
    private T[] item = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        this.item[count++] = item;
    }

    public T get(int index) {
        return this.item[index];
    }

}
