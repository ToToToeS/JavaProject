package Lessons;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myInt;
        do{
            System.out.printf("Введи пятерку");
            myInt = sc.nextInt();
        }while(myInt!=5);//Делать то что выше пока while не станет истиным
        System.out.printf("Победа");
    }

}