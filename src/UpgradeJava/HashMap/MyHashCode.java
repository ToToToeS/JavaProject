package UpgradeJava.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MyHashCode  {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student(2,"Zaur", "Nekitin");
        Student st2 = new Student(1,"Vitalay", "Fedorov");
        Student st3 = new Student(4,"Samsa", "Samsova");

        map.put(st1, 9.3d);
        map.put(st2, 7.3d);
        map.put(st3, 8.4d);

        System.out.println(map.containsKey(new Student(2, "Zaur", "Nekitin")));

        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue() + ":"+ entry.hashCode());
        }
    }
}

class Student {
    public String name;
    public  String surname;
    public  int course;

    public Student(int course, String surname, String name) {
        this.course = course;
        this.surname = surname;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}