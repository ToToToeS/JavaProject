package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        List<Integer> ss = new ArrayList<>();
        ss.add(1);
        ss.set(0, null);
        System.out.println(ss.get(0) + 1);
    }
}
