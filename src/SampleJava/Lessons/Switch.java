package SampleJava.Lessons;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введи возраст ");
        int age = scanner.nextInt();
        switch (age) {
            case 5:// case как бы заменяет If(age==5){}
                System.out.printf("Your age is 5");
                break;
            case 10:
                System.out.printf("You are 10");
                break;
            case 20:
                System.out.printf("You are 20");
                break;
            default: //Если все из выше перечисленных не подходить
                System.out.printf("Ты не тот возраст выбрал");
        }
    }
}
