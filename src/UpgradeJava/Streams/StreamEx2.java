package UpgradeJava.Streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 5, 2, 4, 3, 6, 3, 7};
        Stream<Integer> s1 = Stream.of(1, 2, 3, 4 ,5 ,6, 4);
        Stream<Integer> s2 = Arrays.stream(arr).boxed();

//        System.out.println(Arrays.toString(Stream.concat(s1,  s2).toArray()) + " : " + s2);
//        System.out.println();

        Stream<Integer> s3 = Stream.of(1, 2 ,1 , 4, 2 ,3 , 3);
//        System.out.println(s3.distinct().collect(Collectors.toList()));
//        System.out.println(s3.distinct().count());
        System.out.println(s3.filter(e -> e % 2 == 0 ).peek(System.out::println).count());
    }
}
