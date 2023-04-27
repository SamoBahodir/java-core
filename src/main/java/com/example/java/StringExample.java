package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class StringExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(new Employee(" Name:" + i));
        }
        for (Employee e : list) {
            stringBuilder.append(e.getName());
        }
        System.out.println(stringBuilder);
    }
}


class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
