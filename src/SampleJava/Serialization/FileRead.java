package SampleJava.Serialization;

import java.io.*;
import java.util.Arrays;

public class FileRead {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/SampleJava/Serialization/peapls.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException e) {
            System.out.println("IO");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not foud");
        }
    }
}
