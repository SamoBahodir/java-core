package com.example.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExample1 {

    public static void main(String[] args) {
       FileOqish oqish=new FileOqish();
       oqish.filiOchish();
       oqish.fileOqish();
       oqish.fileYopish();
    }
}
class FileOqish{
    private Scanner file;

    public void filiOchish() {
        try {
            file = new Scanner(new File("newFile.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void fileOqish() {
        while (file.hasNext()) {
            String qator = file.nextLine();
            System.out.println(qator);
        }
    }

    public void fileYopish() {
        file.close();
    }
}