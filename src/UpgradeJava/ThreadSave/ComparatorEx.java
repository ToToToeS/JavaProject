package UpgradeJava.ThreadSave;

import SampleJava.Lessons.ClassesAndObjects;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
    public static void main(String[] args) {
        Student[] arr = new Student[] {new Student(16,1,"Vika"),
                                       new Student(19, 3, "Tolik"),
                                       new Student(19, 3, "Anotolik")};

        Arrays.sort(arr, new compareForName());
        System.out.println(Arrays.toString(arr));
    }
}

class Student {
    int age;
    int course;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", course=" + course +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int age, int course, String name) {
        this.age = age;
        this.course = course;
        this.name = name;
    }


}

class compareForName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}