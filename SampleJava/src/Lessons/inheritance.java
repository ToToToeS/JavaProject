package Lessons;

public class inheritance {
    public static void main(String args[]){
        Dog dog = new Dog();
        dog.gow();
    }
}

class Animal{
    public void eat(){
        System.out.println("I'me eating");
    }

    public void sleep(){
        System.out.println("I'm sleep");
    }
}

class Dog extends Animal {
    public void gow(){
        System.out.println("GOOW");
    }
}
