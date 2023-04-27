package com.example.search.library;

public class Floor {
    private Closed[] closeds = new Closed[30];//shkaf

    public Floor() {
        for (int i = 0; i < 30; i++) {
            this.closeds[i] = new Closed("C"+(i+1));
        }
    }
}
