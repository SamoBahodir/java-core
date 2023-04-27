package com.example.thread;

public class MainThread {
    public static void main(String[] args) {
        MyThread myThread1=new MyThread("one"); // Thread new state
        myThread1.start();// Thread Runnable state
        myThread1.setPriority(10);
        MyThread myThread2=new MyThread("two");
        myThread2.start();
        myThread2.setPriority(8);
    }
}
