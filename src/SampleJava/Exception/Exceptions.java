package SampleJava.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

    }   

    public void TrowingAwayException() throws ScannerException, IOException {
        Scanner scanner  = new Scanner(System.in);
        while (true) {
            try {
                int x = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void catchException() {
        File file = new File("13424");

        try {
            Scanner scanner = new Scanner(file);

            System.out.println("Часть кода в блоке catch после ошибки не выполняется");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        System.out.println("После блока try catch code выполняется");
    }
}
