package SampleJava.Lessons;

public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setNameAndAge("Vitalay", 15);
        person1.speak();


    }
}

class Person {
    String name;
    int age;

    void setNameAndAge(String username, int age1){
        if(username != null && username.trim().isEmpty()) name = username;
        if(age1 % 1 == 0 && age1 > 0 && age1 < 150 ) age = age1;

    }

    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

    void speak(){
        for(int i = 0; i < 1; i++) {
            System.out.println("Меня зовут " + name + " мне " + age + " лет");
        }
    }

    void SpeakHello(){
        System.out.println("Hello");
    }
}