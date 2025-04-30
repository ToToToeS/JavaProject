package SampleJava.Lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "src/Test/test.txt";
        File file = new File(path);

        Scanner sc = new Scanner(file);

        String line = sc.nextLine();
        String[] numbers = line.split(" ");

        int sum = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }
        System.out.println(sum);
        sc.close();
    }
}
