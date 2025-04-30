package SampleJava.Interfaces;

public class Person implements Info{
    public String name;

    public Person(String name){
        this.name = name;
    }

    public void sayHello() {
        System.out.println("HEllO");
    }

    public void showInfo(){
        System.out.println("ID is " + this.name);
    }
}
