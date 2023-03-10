package hw2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        createStringTest();
        writeStringToFile();
    }

    private static StringBuilder createStringTest() {
        StringBuilder sb = new StringBuilder();
        sb.append("TEST ".repeat(100));
        return sb;
    }

    public static void writeStringToFile() {
        try {
            FileOutputStream writeString = new FileOutputStream("src/main/java/hw2/Task2.txt");
            writeString.write(createStringTest().toString().getBytes());
            writeString.close();
        } catch (IOException e) {
            System.out.println("Warning!");
            e.printStackTrace();
        }
    }
}