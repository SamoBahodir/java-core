package com.example.file;

import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        var newFile = "newFile.txt";
        var workingDirectory = System.getProperty("user.dir");
        var path = workingDirectory + File.separator + newFile;

        try {
            File file = new File(path);
            FileOutputStream out = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(out);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
            AAA a = new AAA();
            objectOutputStream.writeObject(a);
            objectOutputStream.close();

            FileInputStream reader = new FileInputStream(path);
            BufferedInputStream bufferedReader = new BufferedInputStream(reader);
            ObjectInputStream objectInputStream = new ObjectInputStream(bufferedReader);
            Object a1 = objectInputStream.readObject();
            AAA aaa= (AAA) a1;

            System.out.println("a: "+aaa.a);
            System.out.println("b: "+aaa.b);
            System.out.println("c: "+aaa.c);
            objectInputStream.close();
        } catch (IOException e) {
            System.out.println("File not writer: ");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class AAA implements Serializable{
    public int a = 100;
    public int b = 200;
    public int c = 300;
}
