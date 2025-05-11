package UpgradeJava.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr = {1, 2, 3, 4, 5};
        int[] a = {1, 2, 4, 5, 6};

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list.stream().map(element -> element + 3 ).collect(Collectors.toList()));

        arr = Arrays.stream(a).map(element -> element += 1).toArray();
        System.out.println(Arrays.toString(arr));

        arr = Arrays.stream(arr).filter(element -> element < 5).toArray();
        System.out.println(Arrays.toString(arr));

        Arrays.stream(arr).forEach(System.out::println);


    }
}

