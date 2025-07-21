package com.methods.methodexample.javaexam;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author A-3
 */
public class NioNewReadWrite {

    private static final String STUDENT_ID = "1287940";
    private static final String STUDENT_NAME = "Robiul Hossain";

    public static void main(String[] args) {
        Path desktop = Paths.get(System.getProperty("user.home"), "Desktop");
        Path folder = desktop.resolve(STUDENT_ID);
        Path file = folder.resolve("NIOExample.txt");

        try {
            Files.createDirectories(folder);
        } catch (IOException e) {
            System.out.println("Could not create folder" + e.getMessage());
        }

        String content = "Hello!! I am" + STUDENT_NAME + "\n I am from Dhaka";

        try {
            Files.write(file,
                    content.getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Successfully write to " + file);
        } catch (IOException e) {
            System.out.println("Write erorr " + e.getMessage());
            return;
        }

        //Read
        try {
            String readData = Files.readString(file, StandardCharsets.UTF_8);
            System.out.println("Content data read from file " + readData);
        } catch (Exception e) {
            System.out.println("Read erorr " + e.getMessage());
        }
    }
}
