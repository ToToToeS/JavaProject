package SampleJava.Lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        Consumer<Integer> method = (n) -> System.out.println(n);

        list.forEach((n) -> {
            System.out.println(n);
            n += 5;
            System.out.println(n);
        } );

        list.forEach(method);

    }
}
