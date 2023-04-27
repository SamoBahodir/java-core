package com.example.collection;

import java.util.PriorityQueue;

public class CollectionPriorityQueue {
    public static void main(String[] args) {
        Bemor bemor1=new Bemor("Fayzullo","Korik",4);
        Bemor bemor2=new Bemor("Jabbor","Travma",1);
        Bemor bemor3=new Bemor("Azzam","Grip",3);
        Bemor bemor4=new Bemor("Jabbor","qon topshirish",2);
        PriorityQueue<Bemor> queue=new PriorityQueue<>();
        queue.add(bemor1);
        queue.add(bemor2);
        queue.add(bemor3);
        queue.add(bemor4);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}

class Bemor implements Comparable<Bemor> {
    private String name;
    private String sabab;
    private int ahamyati;

    public Bemor(String name, String sabab, int ahamyati) {
        this.name = name;
        this.sabab = sabab;
        this.ahamyati = ahamyati;
    }

    public String getName() {
        return name;
    }


    public int getAhamyati() {
        return ahamyati;
    }

    @Override
    public int compareTo(Bemor o) {
        if (this.getAhamyati() == o.getAhamyati())
            return 0;
        else if (this.getAhamyati() > o.getAhamyati())
            return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return "Bemor{" +
                "ahamyati='"+ ahamyati+", "+'\''+
                "name='" + name + '\'' +
                '}';
    }
}