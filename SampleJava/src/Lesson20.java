import java.sql.SQLOutput;
import java.util.Scanner;

public class Lesson20 {
    public static void main(String[] args) {
       Human2.getID();
    }
}

class Human2 {
    private String name;
    private int age;
    public static int ID = 14;
    public static void getID(){
        System.out.println(ID);
    }

    public Human2(){
        System.out.println("Object created ");
    }
    public Human2(String name, int age){
        this.name = name;
        this.age = age;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    void getInfo() {
        System.out.println("Зовут " + name + " лет " + age);
    }
}