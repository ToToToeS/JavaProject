package Interfaces;

public class Animal implements Info{
    public int id;

    public Animal(int id){
        this.id = id;
    }
    public void sleep(){
        System.out.println("I'm sleep");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is "+this.id);
    }
}
