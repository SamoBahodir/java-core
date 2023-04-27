package com.example.thread;

public class MyThread extends Thread {
    private String id;

    public MyThread(String id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int a = 0; a < 1; a++) {   //Thread Running state
            System.out.println("My Thread " + id);
        }
    }
}
