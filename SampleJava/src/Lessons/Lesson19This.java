package Lessons;

import java.util.Scanner;

public class Lesson19This {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Human human1 = new Human();
        human1.setName(s.nextLine());
        System.out.printf(human1.getName());
    }

}

class Human{
    private String name;
    private int age;

    public void setName(String name){
        if(name.isEmpty() == false) {
            this.name = name;
        }else {
            System.out.println("Enter your name");
        }
    }

    public void setAge(int age){
         this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void getInfo(){
        System.out.println(name+" "+age);
    }
}