package SampleJava.File;

import java.io.*;

public class fileWriter {
    public static void main(String[] args) {
        try {
            File file = new File("src\\SampleJava\\Lessons\\File\\text.txt");

            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("hello");

            fileWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
