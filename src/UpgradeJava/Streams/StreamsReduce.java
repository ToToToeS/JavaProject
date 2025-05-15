package UpgradeJava.Streams;

import java.util.stream.Stream;

public class StreamsReduce {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6);
        int resulst = s.reduce(100,(acum, el) -> acum += el);
        System.out.println(resulst);
    }
}



