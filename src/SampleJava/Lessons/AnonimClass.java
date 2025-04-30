package SampleJava.Lessons;

interface AbleToEat {
    public void eat();
    }

class Animal1 {
    public void eat() {
        System.out.println("Animal is eating ...");
    }
}

public class AnonimClass {
    public static void main(String[] args) {
        Animal1 a = new Animal1();
        a.eat();

        Animal1 b = new Animal1() {
            public void eat() {
                System.out.println("Animal another eat ...");
            }
        };


        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Реализация интерфейсов через анониные классы");
            }
        };
        b.eat();
        ableToEat.eat();
    }
}