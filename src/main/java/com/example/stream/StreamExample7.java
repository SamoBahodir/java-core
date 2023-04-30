package com.example.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StreamExample7 {
    strictfp
    public static void main(String[] args) throws IOException {
         System.out.println(Files.lines(Path.of("newFile.txt")).toString());


    }
}

