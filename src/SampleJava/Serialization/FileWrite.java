package SampleJava.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWrite {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Vitalay");
        Person p2 = new Person(2, "Artur");
        Person p3 = new Person(3, "Evasiy");

        try {
            FileOutputStream fos = new FileOutputStream("src\\SampleJava\\Serialization\\peapls.bin");
            ObjectOutputStream ous = new ObjectOutputStream(fos);

            Person[] people = {p1, p2, p3};

            ous.writeObject(people);

            ous.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
