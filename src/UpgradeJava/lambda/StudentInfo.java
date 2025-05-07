package UpgradeJava.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class StudentInfo {

    void printStudentCheck(ArrayList<Student> students, StudentCheck check) {
        for (Student student : students) {
            if (check.check(student)) {
                System.out.println(student);
            }
        }
    }

    void printStudentOverGrade(ArrayList<Student> students,double grade) {
        for (Student student : students) {
            if (student.avgGrade > grade) {
                System.out.println(student);
            }
        }
    }
    void printStudentsUnderAge(ArrayList<Student> students,int age) {
        for (Student student : students) {
            if (student.avgGrade < age) {
                System.out.println(student);
            }
        }
    }
    void printStudentsMixCondition(ArrayList<Student> students,double grade,int age, char sex) {
        for (Student student : students) {
            if (student.avgGrade < grade && student.age < age && student.sex == sex) {
                System.out.println(student);
            }
        }
    }
}

interface StudentCheck {
    boolean check(Student students);
}

class checkAge implements StudentCheck {
    @Override
    public boolean check(Student students) {
        return students.age >= 18;
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 18, 3, 9.3);
        Student st2 = new Student("Nazar", 'm', 18, 3, 4);
        Student st3 = new Student("Petr", 'm', 18, 3, 4.4);
        Student st4 = new Student("Nastya", 'f', 18, 3, 5.3);
        Student st5 = new Student("Tolik", 'm', 18, 3, 6.4);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo() {

        };

        info.printStudentOverGrade(students, 8);

        info.printStudentCheck(students, new StudentCheck() {
            @Override
            public boolean check(Student students) {
                return students.age >= 18;
            }
        } );

        System.out.println("------------------------");






        info.printStudentCheck(students, (Student student) -> {return student.avgGrade >= 18;} );
        info.printStudentCheck(students, student -> student.avgGrade >= 18);


        Collections.sort(students, (s1, s2) -> (int) (s1.avgGrade - s2.avgGrade));

        System.out.println(students);



    }
}