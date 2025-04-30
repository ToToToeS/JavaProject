package SampleJava.Serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }
}
