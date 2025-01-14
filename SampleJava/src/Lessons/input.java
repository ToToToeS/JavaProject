package Lessons;

import java.util.Scanner;

//public class input {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);/* s Это объект класса Scanner который в дальнейшем используем ниже*/
//        System.out.printf("Введите что-нибудь "+);
//        int myInt = s.nextInt();
//
//        System.out.printf("вы ввели "+ myInt);
//    }
//}

public class input {
    public static void main(String[] args){
        Scanner scanner = new Scanner("Petruh ty lox\n"+"oh yes");
        String s = scanner.nextLine() ;
        System.out.println(s);

    }
}