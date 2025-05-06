package UpgradeJava.Queue;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {//FIFO
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(-1);
        queue.add(434);
        queue.add(-123123);

        System.out.println(queue.poll()); // poll = removeFirst + getFirst
        System.out.println(queue.element()); // Fist element int queue
        System.out.println(queue.peek()); // Тоже самое что и element но не выдает ошибку
        System.out.println(queue);

        Queue<Student> students = new LinkedList<>();

        students.add((new Student(4, "Vitalik")));
        students.add((new Student(3, "Nikita")));
        students.add((new Student(3, "Tolik")));
        students.add((new Student(2, "Petr")));

        System.out.println(students.peek());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
    }
}

class Student implements Comparable<Student>{
    public String name;
    public  int course;

    public Student(int course, String name) {
        this.course = course;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public int compareTo(Student o) {
        return o.course - this.course;
    }
}
