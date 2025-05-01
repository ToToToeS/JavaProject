package UpgradeJava;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<Student>();
        students.add(new Student("Vika", 1));
        students.add(new Student("Tolya", 2));
        students.add(new Student("Azur", 3));
        students.add(new Student("Egor", 4));

        System.out.println("LinkedList " + students);

    }

    public static class Student {
        String name;
        int course;

        public Student(String name, int course) {
            this.name = name;
            this.course = course;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", course=" + course +
                    '}';
        }
    }
}
