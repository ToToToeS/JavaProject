package UpgradeJava.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamFlatMap  {
    public static void main(String[] args) {
        Student s1 = new Student("Vika");
        Student s2 = new Student("Nika");
        Student s3 = new Student("Petr");
        Student s4 = new Student("Ega");

        Faculty fac1 = new Faculty();
        Faculty fac2 = new Faculty();
        fac1.addStudents(s1);
        fac1.addStudents(s2);
        fac2.addStudents(s3);
        fac2.addStudents(s4);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(fac1);
        faculties.add(fac2);

        faculties.stream().flatMap(e -> e.faculty.stream()).forEach(student -> {
            System.out.println(student.name);
        });
    }
}

class Faculty{
    ArrayList<Student> faculty;

    Faculty() {
        faculty = new ArrayList<>();
    }

    public void addStudents(Student student) {
        faculty.add(student);
    }

}

class Student{
    public String name;

    Student(String name) {
        this.name = name;
    }
}