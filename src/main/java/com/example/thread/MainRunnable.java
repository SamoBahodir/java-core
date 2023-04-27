package com.example.thread;

public class MainRunnable {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("three");
        Thread thread= Thread.currentThread();
        myThread.start();
        myThread.setPriority(8);
        System.out.println(myThread.getPriority());
        thread.setPriority(7);
        System.out.println(thread.getPriority());
    }
}
