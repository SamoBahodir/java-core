package com.example.string;

import java.io.*;

public class StringMain {
    public static void main(String[] args) {
        try {

            serialize();
            deSerialize();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void serialize() throws IOException {
        Student s1 = new Student();
        s1.name = "Alish";
        s1.age = 22;

        FileOutputStream fos = new FileOutputStream("student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
    }

    public static void deSerialize() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s2 = (Student) ois.readObject();
        System.out.println(s2.name + " " + s2.age);
    }
}


class Student implements Serializable {
    public String name;
    public Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}